package com.booking.ticket.model;

import java.time.LocalDateTime;
import java.util.List;

public class ShowSeatRequest {
	private long mappingId;
	private long showId;
	public LocalDateTime showTime;
	private List<Integer> seatIds;
	
	

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
	public List<Integer> getSeatIds() {
		return seatIds;
	}
	public void setSeatIds(List<Integer> seatIds) {
		this.seatIds = seatIds;
	}
	public LocalDateTime getShowTime() {
		return showTime;
	}
	public void setShowTime(LocalDateTime showTime) {
		this.showTime = showTime;
	}
	

}
