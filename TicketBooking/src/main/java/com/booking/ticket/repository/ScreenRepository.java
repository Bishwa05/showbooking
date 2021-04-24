package com.booking.ticket.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.booking.ticket.data.Screen;

public interface ScreenRepository extends CrudRepository<Screen, Long> {


	@Query("select s.screenName from Screen s where s.screenId = :screenId")
	String getScreenNameById(@Param("screenId") Long screenId);
}