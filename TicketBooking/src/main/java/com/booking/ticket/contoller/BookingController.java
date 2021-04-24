package com.booking.ticket.contoller;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.booking.ticket.dto.BookingDetailDto;
import com.booking.ticket.dto.ShowDetailDto;
import com.booking.ticket.dto.ShowSeatRequestDto;
import com.booking.ticket.model.BookingDetailResponse;
import com.booking.ticket.model.ShowSeatRequest;
import com.booking.ticket.service.BookingService;

import io.micrometer.core.annotation.Timed;

@RestController
@RequestMapping("/")
public class BookingController {
	
	@Autowired
	BookingService bookingService;

    @Timed(value = "search_show", longTask = true)
	@RequestMapping(value = "/search",produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
	public ResponseEntity<List<ShowDetailDto>> searchSeat(@RequestParam String theaterName, @RequestParam String city) {
    	
    	// cache
		ModelMapper modelMapper = new ModelMapper(); 
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		List<ShowDetailDto> showResponseDtoList = bookingService.checkRunningShows(theaterName, city);
		//Type responseDto = new ArrayList<ShowResponse>();
		//List<ShowResponse> returnValue = modelMapper.map(showResponseDtoList, new ArrayList());
		
		
		return ResponseEntity.status(HttpStatus.CREATED).body(showResponseDtoList);
	
	}
	
    @Timed(value = "book_show", longTask = true)
	@RequestMapping(
			value = "/book",
			consumes = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE },
			produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE },
			 method = RequestMethod.POST
			)
	public ResponseEntity<BookingDetailResponse> bookShow(@RequestBody ShowSeatRequest seatRequest) {
		ModelMapper modelMapper = new ModelMapper(); 
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		ShowSeatRequestDto showSeatRequestDto = modelMapper.map(seatRequest, ShowSeatRequestDto.class);
		
		BookingDetailDto bookingDetailDto = bookingService.bookShow(showSeatRequestDto);
		
		BookingDetailResponse returnValue = modelMapper.map(bookingDetailDto, BookingDetailResponse.class);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(returnValue);
	
	}
}
