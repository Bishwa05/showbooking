package com.booking.ticket.data;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ShowSeatMapping")
public class ShowSeatMapping {
	
	ShowSeatMapping(){
		
	}
	
	public ShowSeatMapping(long showId, long mappingId, char isRunning, long seatId, char isSeatLocked,
			char isSeatAvailable, LocalDateTime startTime, LocalDateTime endTime) {
		super();
		this.showId = showId;
		this.mappingId = mappingId;
		this.isRunning = isRunning;
		this.seatId = seatId;
		this.isSeatLocked = isSeatLocked;
		this.isSeatAvailable = isSeatAvailable;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	@Id
	public long id;
	@Column
	public long showId;
	@Column
	private long mappingId;
	@Column
	private char isRunning;
	@Column
	public long seatId;
	@Column
	private char isSeatLocked;
	@Column
	private char isSeatAvailable;
	@Column
	private LocalDateTime startTime;
	@Column
	private LocalDateTime endTime;
	
	@Getter
	@Column
	private char isFinished;
	
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

	public char getIsRunning() {
		return isRunning;
	}

	public void setIsRunning(char isRunning) {
		this.isRunning = isRunning;
	}

	public long getSeatId() {
		return seatId;
	}

	public void setSeatId(long seatId) {
		this.seatId = seatId;
	}

	public char getIsSeatLocked() {
		return isSeatLocked;
	}

	public void setIsSeatLocked(char isSeatLocked) {
		this.isSeatLocked = isSeatLocked;
	}

	public char getIsSeatAvailable() {
		return isSeatAvailable;
	}

	public void setIsSeatAvailable(char isSeatAvailable) {
		this.isSeatAvailable = isSeatAvailable;
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

	public char getIsFinished() {
		return isFinished;
	}

	public void setIsFinished(char isFinished) {
		this.isFinished = isFinished;
	}

	@Override
	public String toString() {
		return "ShowSeatMapping [showId=" + showId + ", mappingId=" + mappingId + ", isRunning=" + isRunning
				+ ", seatId=" + seatId + ", isSeatLocked=" + isSeatLocked + ", isSeatAvailable=" + isSeatAvailable
				+ ", startTime=" + startTime + ", endTime=" + endTime + "]";
	}
	
	
}
