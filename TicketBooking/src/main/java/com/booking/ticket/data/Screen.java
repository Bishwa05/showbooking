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
@Table(name = "Screen")
public class Screen
{
	
	Screen(){
		
	}
	public Screen(long screenId, String screenName, int capacity, char is3D) {
		super();
		this.screenId = screenId;
		this.screenName = screenName;
		this.capacity = capacity;
		this.is3D = is3D;
	}
	@Id
	private long screenId;
	@Column
	private String screenName;
	@Column
	private int capacity;
	@Column
	public char is3D;

}
