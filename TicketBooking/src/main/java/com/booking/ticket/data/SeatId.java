package com.booking.ticket.data;

import java.io.Serializable;

public class SeatId implements Serializable {

	private long seatId;

	private long mappingId;
	
	SeatId(){
		
	}

	public SeatId(long seatId, long mappingId) {
		super();
		this.seatId = seatId;
		this.mappingId = mappingId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (mappingId ^ (mappingId >>> 32));
		result = prime * result + (int) (seatId ^ (seatId >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SeatId other = (SeatId) obj;
		if (mappingId != other.mappingId)
			return false;
		if (seatId != other.seatId)
			return false;
		return true;
	}
	
	
}
