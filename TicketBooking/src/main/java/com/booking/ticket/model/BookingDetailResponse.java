package com.booking.ticket.model;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.booking.ticket.data.AddOn;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class BookingDetailResponse {
    private String bookingId;
    private Long userId;
    private Long theaterId;
    private Long screenId;
    private String seatDetails;
    private AddOn addOn;
    private Double amount;
    private Date bookingDate;
    private LocalDateTime showTime;
	public BookingDetailResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookingDetailResponse(String bookingId, long userId, long theaterId, long screenId, String seatDetails,
			AddOn addOn, double amount, Date bookingDate, LocalDateTime showTime) {
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
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getTheaterId() {
		return theaterId;
	}
	public void setTheaterId(Long theaterId) {
		this.theaterId = theaterId;
	}
	public Long getScreenId() {
		return screenId;
	}
	public void setScreenId(Long screenId) {
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
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
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
