package com.booking.ticket.data;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "Booking")
public class Booking
{
	Booking(){	
	}
	
	public Booking(long userId, long theaterId, long screenId,
			String seatIds, double amount, Date bookingDate, LocalDateTime showTime){
		this.bookingId = UUID.randomUUID().toString();
		this.userId = userId;
		this.theaterId = theaterId;
		this.screenId = screenId;
		this.seatIds = seatIds;
		this.amount = amount;
		this.bookingDate = bookingDate;
		this.showTime = showTime;
	}
	@Id
	//@GeneratedValue
    private String bookingId;
	@Column
    private long userId;
	@Column
    private long theaterId;
	@Column
    private long screenId;
	@Column
    private String seatIds;
    @Column
    private double amount;
    @Column
    private Date bookingDate;
    @Column
    private LocalDateTime showTime;
    
    
	public String getBookingId() {
		return bookingId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
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

	public String getSeatIds() {
		return seatIds;
	}

	public void setSeatIds(String seatIds) {
		this.seatIds = seatIds;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public LocalDateTime getShowTime() {
		return showTime;
	}

	public void setShowTime(LocalDateTime showTime) {
		this.showTime = showTime;
	}
    

}
