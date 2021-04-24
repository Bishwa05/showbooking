package com.booking.ticket.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@Entity
@Table(name = "Theater")
public class Theater
{

	Theater(){
		
	}
	
	public Theater(long theaterId, String theaterName, String city, int totalScreens, char isMaintainance) {
		super();
		this.theaterId = theaterId;
		this.theaterName = theaterName;
		this.city = city;
		this.totalScreens = totalScreens;
		this.isMaintenance = isMaintenance;
	}
	@Id
	public long theaterId;
	@Column
    private String theaterName;
	@Column
    private String city;
	@Column
    private int totalScreens;
	@Column
    private char isMaintenance;
	@Override
	public String toString() {
		return "Theater [theaterId=" + theaterId + ", theaterName=" + theaterName + ", city=" + city + ", totalScreens="
				+ totalScreens + ", isMaintenance=" + isMaintenance + "]";
	}
	
	

}