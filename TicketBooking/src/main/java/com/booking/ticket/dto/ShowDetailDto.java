package com.booking.ticket.dto;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class ShowDetailDto {
	private long screenId;
	public String screenName;
	public long showId;
	public String showName;
	public LocalDateTime startTime;
	public LocalDateTime endTime;
	List<SeatDto> showSeatList;
	
	
	public ShowDetailDto() {
		
	}


	public ShowDetailDto(long screenId, String screenName, long showId, String showName, LocalDateTime startTime, LocalDateTime endTime,
			List<SeatDto> showSeatList) {
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


//	public Date getStartTime() {
//		return startTime;
//	}
//
//
//	public void setStartTime(Date startTime) {
//		this.startTime = startTime;
//	}
//
//
//	public Date getEndTime() {
//		return endTime;
//	}
//
//
//	public void setEndTime(Date endTime) {
//		this.endTime = endTime;
//	}


	public List<SeatDto> getShowSeatList() {
		return showSeatList;
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


	public void setShowSeatList(List<SeatDto> showSeatList) {
		this.showSeatList = showSeatList;
	}
	
	
	
	
}
