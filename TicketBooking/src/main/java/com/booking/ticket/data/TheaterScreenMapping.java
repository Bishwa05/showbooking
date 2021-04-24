package com.booking.ticket.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TheaterScreenMapping")
public class TheaterScreenMapping {

	TheaterScreenMapping(){
		
	}
	
	public TheaterScreenMapping(long mappingId, long theaterId, long screenId, char isVisible) {
		super();
		this.mappingId = mappingId;
		this.theaterId = theaterId;
		this.screenId = screenId;
		this.isVisible = isVisible;
	}
	
	@Id
	public long mappingId;
	@Column
	private long theaterId;
	@Column
	public long screenId;
	@Column
	private char isVisible;
	
	
	
	public long getMappingId() {
		return mappingId;
	}

	public void setMappingId(long mappingId) {
		this.mappingId = mappingId;
	}

	public long getTheaterId() {
		return theaterId;
	}

	public void setTheaterId(long theaterId) {
		this.theaterId = theaterId;
	}

	public long getScreenId() {
		return screenId;
	}

	public void setScreenId(long screenId) {
		this.screenId = screenId;
	}

	public char getIsVisible() {
		return isVisible;
	}

	public void setIsVisible(char isVisible) {
		this.isVisible = isVisible;
	}

	@Override
	public String toString() {
		return "TheaterScreenMapping [mappingId=" + mappingId + ", theaterId=" + theaterId + ", screenId=" + screenId
				+ ", isVisible=" + isVisible + "]";
	}
	
	
}


