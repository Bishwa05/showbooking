package com.booking.ticket.repository;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.booking.ticket.data.Seat;
import com.booking.ticket.data.SeatId;

public interface SeatRepository extends CrudRepository<Seat, SeatId> {


	@Query("select s from Seat s where s.seatId = :seatId and s.mappingId = :mappingId")
	Seat findBySeatId(@Param("seatId") Long seatId, @Param("mappingId") Long mappingId);
	
	@Query("select s from Seat s where s.seatId in :seatIds and s.mappingId = :mappingId")
	Stream<Seat> findAllBySeatIds(@Param("seatIds") List<Long> seatIds, @Param("mappingId") Long mappingId);
}