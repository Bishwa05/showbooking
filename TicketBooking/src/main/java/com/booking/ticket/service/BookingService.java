package com.booking.ticket.service;

import java.util.List;

import com.booking.ticket.dto.BookingDetailDto;
import com.booking.ticket.dto.ShowDetailDto;
import com.booking.ticket.dto.ShowSeatRequestDto;

public interface BookingService {
	List<ShowDetailDto> checkRunningShows(String theaterName, String city);
	
	BookingDetailDto bookShow(ShowSeatRequestDto seatRequest);
}
