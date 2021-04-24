package com.booking.ticket.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Seat")
@IdClass(SeatId.class)
public class Seat {
	
	Seat(){
		
	}
	
	public Seat(long seatId, long mappingId, char seatRow, int seatCol, char isAvialble, int category) {
		super();
		this.seatId = seatId;
		this.mappingId = mappingId;
		this.seatRow = seatRow;
		this.seatCol = seatCol;
		this.isAvialble = isAvialble;
		this.category = category;
	}
	
	@Id
	private long seatId;
	@Id
	private long mappingId;
	@Column
	private char seatRow;
	@Column
	private int seatCol;
	@Column
	private char isAvialble;
	@Column
	private int category;
	
	
	public long getSeatId() {
		return seatId;
	}

	public long getMappingId() {
		return mappingId;
	}


	public char getSeatRow() {
		return seatRow;
	}

	public int getSeatCol() {
		return seatCol;
	}

	public char getIsAvialble() {
		return isAvialble;
	}
	
	public int getCategory() {
		return category;
	}


	@Override
	public String toString() {
		return "Seat [seatId=" + seatId + ", mappingId=" + mappingId + ", seatRow=" + seatRow + ", seatCol=" + seatCol
				+ ", isAvialble=" + isAvialble + ", category=" + category + "]";
	}
	
	
	
	
}

enum CATEGORY{
	GOLD,
	SILVER,
	BRONZE,
}
