package com.booking.ticket.dto;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.booking.ticket.data.AddOn;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class BookingDetailDto {

    private String bookingId;
    private long userId;
    private long theaterId;
    private long screenId;
    private String seatDetails;
    private AddOn addOn;
    private double amount;
    private Date bookingDate;
    private LocalDateTime showTime;
    
    
    
    
	public BookingDetailDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookingDetailDto(String bookingId, long userId, long theaterId, long screenId, String seatDetails, AddOn addOn,
			double amount, Date bookingDate, LocalDateTime showTime) {
		super();
		this.bookingId = bookingId;
		this.userId = userId;
		this.theaterId = theaterId;
		this.screenId = screenId;
		this.seatDetails = seatDetails;
		this.addOn = addOn;
		this.amount = amount;
		this.bookingDate = bookingDate;
		this.showTime = showTime;
	}
	public String getBookingId() {
		return bookingId;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
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

	
	public String getSeatDetails() {
		return seatDetails;
	}
	public void setSeatDetails(String seatDetails) {
		this.seatDetails = seatDetails;
	}
	public AddOn getAddOn() {
		return addOn;
	}
	public void setAddOn(AddOn addOn) {
		this.addOn = addOn;
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
