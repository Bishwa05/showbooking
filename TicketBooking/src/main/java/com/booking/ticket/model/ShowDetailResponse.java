package com.booking.ticket.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import com.booking.ticket.data.Screen;
import com.booking.ticket.data.Seat;
import com.booking.ticket.data.Show;
import com.booking.ticket.dto.SeatDto;

public class ShowDetailResponse {
	
	private long screenId;
	public String screenName;
	public long showId;
	public String showName;
	public LocalDateTime startTime;
	public LocalDateTime endTime;
	List<SeatDto> showSeatList;
	
	
	public ShowDetailResponse() {
		
	}
	
	
	public ShowDetailResponse(long screenId, String screenName, long showId, String showName, LocalDateTime startTime,
			LocalDateTime endTime, List<SeatDto> showSeatList) {
		super();
		this.screenId = screenId;
		this.screenName = screenName;
		this.showId = showId;
		this.showName = showName;
		this.startTime = startTime;
		this.endTime = endTime;
		this.showSeatList = showSeatList;
	}


	public long getScreenId() {
		return screenId;
	}
	public void setScreenId(long screenId) {
		this.screenId = screenId;
	}
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	public long getShowId() {
		return showId;
	}
	public void setShowId(long showId) {
		this.showId = showId;
	}
	public String getShowName() {
		return showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}
	public LocalDateTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}
	public LocalDateTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}
	public List<SeatDto> getShowSeatList() {
		return showSeatList;
	}
	public void setShowSeatList(List<SeatDto> showSeatList) {
		this.showSeatList = showSeatList;
	}
	@Override
	public String toString() {
		return "ShowDetailResponse [screenId=" + screenId + ", screenName=" + screenName + ", showId=" + showId
				+ ", showName=" + showName + ", startTime=" + startTime + ", endTime=" + endTime + ", showSeatList="
				+ showSeatList + "]";
	}
	
	
}
