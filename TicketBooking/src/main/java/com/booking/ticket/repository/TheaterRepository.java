package com.booking.ticket.repository;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.booking.ticket.data.Theater;


public interface TheaterRepository extends CrudRepository<Theater, Long> {



    @Query("select t from Theater t where t.theaterName = :theaterName and t.city = :city")
    Theater findByNameAndCityStream(@Param("theaterName") String theaterName,
    										@Param("city") String city);
}