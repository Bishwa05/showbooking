package com.booking.ticket.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class SeatDto {

	private long seatId;
	private long mappingId;
	private char seatRow;
	private int seatCol;
	private char isAvialble;
	private int category;
	
	
	public SeatDto(){
		
	}
	
	public SeatDto(long seatId, long mappingId, char seatRow, int seatCol, char isAvialble, int category) {
		super();
		this.seatId = seatId;
		this.mappingId = mappingId;
		this.seatRow = seatRow;
		this.seatCol = seatCol;
		this.isAvialble = isAvialble;
		this.category = category;
	}



	public long getSeatId() {
		return seatId;
	}

	public void setSeatId(long seatId) {
		this.seatId = seatId;
	}

	public long getMappingId() {
		return mappingId;
	}

	public void setMappingId(long mappingId) {
		this.mappingId = mappingId;
	}

	public char getSeatRow() {
		return seatRow;
	}

	public void setSeatRow(char seatRow) {
		this.seatRow = seatRow;
	}

	public int getSeatCol() {
		return seatCol;
	}

	public void setSeatCol(int seatCol) {
		this.seatCol = seatCol;
	}

	public char getIsAvialble() {
		return isAvialble;
	}

	public void setIsAvialble(char isAvialble) {
		this.isAvialble = isAvialble;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Seat [seatId=" + seatId + ", mappingId=" + mappingId + ", seatRow=" + seatRow + ", seatCol=" + seatCol
				+ ", isAvialble=" + isAvialble + ", category=" + category + "]";
	}
	
}
