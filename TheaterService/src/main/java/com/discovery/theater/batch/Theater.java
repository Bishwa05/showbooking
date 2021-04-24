package com.discovery.theater.batch;

import javax.persistence.Column;
import javax.persistence.Id;

public class Theater {


	public Theater(){
		
	}
	
	public Theater(String theaterName, String city, Integer totalScreens, char isMaintainance) {
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

	public long getTheaterId() {
		return theaterId;
	}

	public void setTheaterId(long theaterId) {
		this.theaterId = theaterId;
	}

	public String getTheaterName() {
		return theaterName;
	}

	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getTotalScreens() {
		return totalScreens;
	}

	public void setTotalScreens(int totalScreens) {
		this.totalScreens = totalScreens;
	}

	public char getIsMaintenance() {
		return isMaintenance;
	}

	public void setIsMaintenance(char isMaintenance) {
		this.isMaintenance = isMaintenance;
	}

	@Override
	public String toString() {
		return "Theater [theaterId=" + theaterId + ", theaterName=" + theaterName + ", city=" + city + ", totalScreens="
				+ totalScreens + ", isMaintenance=" + isMaintenance + "]";
	}
	
	

}
