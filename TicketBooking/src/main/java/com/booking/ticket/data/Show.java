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
@Table(name = "Show")
public class Show {
	
	Show(){
		
	}
	
	public Show(long showId, int duration, double imdbRating, char isSubsidized, String contentRating, String details,
			int status) {
		super();
		this.showId = showId;
		this.duration = duration;
		this.imdbRating = imdbRating;
		this.isSubsidized = isSubsidized;
		this.contentRating = contentRating;
		this.showName = details;
		this.status = status;
	}
	@Id
	private long showId;
	@Column
	private String showName;
	@Column
	private int duration; //in minutes
	@Column
	private double imdbRating;
	@Column
	private char isSubsidized;
	@Column
	private String contentRating; // 'U', 'U/A', A

	@Column
	private int status;
}

enum SHOW_STATUS {
	UPCOMING,
	RUNNING,
	STOPPED
}