package com.booking.ticket.dto;

import java.time.LocalDateTime;
import java.util.List;

public class ShowSeatRequestDto {
	private long mappingId;
	private long showId;
	public LocalDateTime showTime;
	private List<Long> seatIds;
	
	
	public long getShowId() {
		return showId;
	}
	public void setShowId(long showId) {
		this.showId = showId;
	}
	public long getMappingId() {
		return mappingId;
	}
	public void setMappingId(long mappingId) {
		this.mappingId = mappingId;
	}
	public List<Long> getSeatIds() {
		return seatIds;
	}
	public void setSeatIds(List<Long> seatIds) {
		this.seatIds = seatIds;
	}
	public LocalDateTime getShowTime() {
		return showTime;
	}
	public void setShowTime(LocalDateTime showTime) {
		this.showTime = showTime;
	}
	
}
