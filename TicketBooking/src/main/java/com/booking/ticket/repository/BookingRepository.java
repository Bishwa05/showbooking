package com.booking.ticket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.booking.ticket.data.Booking;
import java.util.UUID;

public interface BookingRepository extends JpaRepository<Booking, UUID> {

}
