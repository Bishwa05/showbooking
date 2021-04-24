package com.booking.ticket.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.booking.ticket.data.ShowSeatMapping;

public interface ShowSeatMappingRepository extends CrudRepository<ShowSeatMapping, Long> {
	
	@Query("select s from ShowSeatMapping s where s.mappingId in :ids and s.isRunning = 'Y' and s.isSeatAvailable='Y' and s.isSeatLocked='N' order by s.mappingId, s.showId, s.seatId")
    List<ShowSeatMapping> findShowSeatByMappingId(@Param("ids") Set<Long> ids);
	
	
	@Query("select s from ShowSeatMapping s where s.mappingId in :id and s.isRunning = 'Y' and s.isSeatAvailable='Y' and s.isSeatLocked='N' order by s.mappingId, s.showId, s.seatId")
    List<ShowSeatMapping> findShowSeatByMappingId(@Param("id") Long id);
	
	@Transactional
	@Modifying
	@Query("update ShowSeatMapping s set s.isSeatLocked='Y' where s.mappingId = :mappingId and s.seatId = :seatId and s.showId = :showId")
	void lockTheSeat(@Param("mappingId")Long mappingId, @Param("seatId")Long seatId,  @Param("showId")Long showId);
	
	
	@Transactional
	@Modifying
	@Query("update ShowSeatMapping s set s.isSeatAvailable='N' where s.mappingId = :mappingId and s.seatId = :seatId and s.showId = :showId")
	void bookTheSeat(@Param("mappingId")Long mappingId, @Param("seatId")Long seatId,  @Param("showId")Long showId);

	@Transactional
	@Modifying
	@Query("update ShowSeatMapping s set s.isSeatLocked='N'  where s.mappingId = :mappingId and s.seatId = :seatId and s.showId = :showId")
	void freeTheSeat(@Param("mappingId")Long mappingId, @Param("seatId")Long seatId,  @Param("showId")Long showId);
}
