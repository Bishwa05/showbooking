package com.booking.ticket.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.booking.ticket.data.Show;

public interface ShowRepository extends CrudRepository<Show, Long> {


	@Query("select s.showName from Show s where s.showId = :showId")
	String getShowNameById(@Param("showId") Long showId);
}