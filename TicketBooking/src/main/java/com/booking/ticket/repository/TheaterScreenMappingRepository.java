package com.booking.ticket.repository;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.booking.ticket.data.TheaterScreenMapping;


public interface TheaterScreenMappingRepository extends CrudRepository<TheaterScreenMapping, Long> {

    @Query("select t from TheaterScreenMapping t where t.theaterId = :theaterId")
    Stream<TheaterScreenMapping> findByTheaterNameStream(@Param("theaterId") long theaterId);
    
    @Query("select t from TheaterScreenMapping t where t.mappingId = :mappingId")
    TheaterScreenMapping findByTheaterByMappingId(@Param("mappingId") long mappingId);

}