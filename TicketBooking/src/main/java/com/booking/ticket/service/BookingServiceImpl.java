package com.booking.ticket.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.booking.ticket.data.TheaterScreenMapping;
import com.booking.ticket.data.AddOn;
import com.booking.ticket.data.Booking;
import com.booking.ticket.data.Seat;
import com.booking.ticket.data.SeatId;
import com.booking.ticket.data.ShowSeatMapping;
import com.booking.ticket.data.Theater;
import com.booking.ticket.dto.BookingDetailDto;
import com.booking.ticket.dto.SeatDto;
import com.booking.ticket.dto.ShowDetailDto;
import com.booking.ticket.dto.ShowSeatRequestDto;
import com.booking.ticket.repository.TheaterScreenMappingRepository;
import com.booking.ticket.repository.BookingRepository;
import com.booking.ticket.repository.ScreenRepository;
import com.booking.ticket.repository.SeatRepository;
import com.booking.ticket.repository.ShowRepository;
import com.booking.ticket.repository.ShowSeatMappingRepository;
import com.booking.ticket.repository.TheaterRepository;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    TheaterRepository theaterRepository;
    
    @Autowired
    TheaterScreenMappingRepository theaterScreenMappingRepository;
    
    
    @Autowired
    ShowSeatMappingRepository showSeatMappingRepository;
    
    @Autowired
    ShowRepository showRepository;
    
    @Autowired
    ScreenRepository screenRepository;
    
    @Autowired
    SeatRepository seatRepository;
    
    @Autowired
    BookingRepository bookingRepository;
    
	@Override
	@Transactional(readOnly = false)
	public List<ShowDetailDto> checkRunningShows(String theaterName, String city) {
		
		Theater th = theaterRepository.findByNameAndCityStream(theaterName, city);
		System.out.println(th);
		
		
		Stream<TheaterScreenMapping> ssm = 
				theaterScreenMappingRepository.findByTheaterNameStream(th.theaterId);
		
		Map<Long, Long> mappingScreenIdMap = new HashMap<>();
		mappingScreenIdMap.keySet();

		ssm.forEach((e)->{
			mappingScreenIdMap.put(e.mappingId, e.screenId);
		});
		
		List<ShowSeatMapping> shows = 
				showSeatMappingRepository.findShowSeatByMappingId(mappingScreenIdMap.keySet());
		
		long prevMappingId = 0L;
		long prevShowId = 0L;
		Map<String, List<SeatDto>> showSeatMap = null;
		List<SeatDto> seatList = null;
//		ShowResponseDto showResp;
//		List<ShowResponseDto> response= new ArrayList<>();
		
		ShowDetailDto showDetail;
		List<ShowDetailDto> response= new ArrayList<>();
		String showName = "";
		
		
		for(ShowSeatMapping showSeat : shows) {
			
			long showId = showSeat.showId;
			
			if(prevShowId != showId) {
				showSeatMap = new HashMap<>();
				seatList = new ArrayList<>();
				showName = showRepository.getShowNameById(showId);
				showSeatMap.put(showName, seatList);
			}
			
			Optional<Seat> seat = seatRepository.findById(new SeatId(showSeat.seatId, showSeat.getMappingId()));
			
			SeatDto seatDto = getSeatDto(seat);
			seatList.add(seatDto);
			
			if(showSeat.getMappingId() != prevMappingId) {
				long screenId = mappingScreenIdMap.get(showSeat.getMappingId());
				String screenName = screenRepository.getScreenNameById(screenId);
				
				ShowDetailDto sdt = new ShowDetailDto(screenId, screenName, showId, showName, showSeat.getStartTime(),
						showSeat.getEndTime(), seatList);
				response.add(sdt);
				
			}
			
			prevMappingId = showSeat.getMappingId();
			prevShowId = showId;
		}
		
		return response;
	}

	private SeatDto getSeatDto(Optional<Seat> seat) {
		SeatDto seatDto = null;
		if(seat.isPresent()) {
			Seat s = seat.get();
			seatDto = new SeatDto( s.getSeatId(), s.getMappingId(),s.getSeatRow(),
					  s.getSeatCol(),s.getIsAvialble(), s.getCategory());
		} else {
			seatDto = new SeatDto();	
		}
		return seatDto;
	}

	@Override
	@Transactional(readOnly = true)
	public BookingDetailDto bookShow(ShowSeatRequestDto seatRequest) {
		
		long mappingId = seatRequest.getMappingId();
		long showId = seatRequest.getShowId();
		List<Long> seatIds = seatRequest.getSeatIds();
		
		for(Long seatId : seatIds) {
			showSeatMappingRepository.lockTheSeat(mappingId, seatId, showId);
		}
		
		// Go with the order and amount calculation
		
		// if ticket is booked
		for(Long seatId : seatIds) {
			showSeatMappingRepository.bookTheSeat(mappingId, seatId, showId);
		}
		
		// if ticket is not booked
		/**
		 * 		for(Long seatId : seatIds) {
					showSeatMappingRepository.freeTheSeat(mappingId, seatId, showId);
				}
		 * 
		 */
		
		String seatRowColDetails = getSeatDetails(seatIds, mappingId);
		
		// create a booking object
		Booking booked = getBooking(mappingId,seatRowColDetails, seatRequest.showTime);
		bookingRepository.saveAndFlush(booked);
		System.out.println("Bishwa: "+ bookingRepository.count());
		
		// get the 
		return new BookingDetailDto(booked.getBookingId(), 2L, booked.getTheaterId(),
				booked.getScreenId(), booked.getSeatIds(), null, booked.getAmount(), booked.getBookingDate(),
				booked.getShowTime());
	}

	private Booking getBooking(Long mappingId, String seats, LocalDateTime showTime) {
		TheaterScreenMapping tsm = theaterScreenMappingRepository.findByTheaterByMappingId(mappingId);
		
		// Price calculation happens in different class, now hardcoding to 1000
		Date now = new Date();
		double amount = 1000.00;
		Booking b = new Booking(2, tsm.getTheaterId(), tsm.getScreenId(), seats, amount,
				now, showTime);
		return b;
	}

	private String getSeatDetails(List<Long> seatIds, Long mappingId) {
		StringBuffer sb = new StringBuffer();
		
		Stream<Seat> seatStream = seatRepository.findAllBySeatIds(seatIds, mappingId);
		
		seatStream.forEach((e)->{
			sb.append(e.getSeatRow() +"#"+e.getSeatCol()).append(",");
		});
		sb.deleteCharAt(sb.length()-1);
		return sb.toString();
	}

}
