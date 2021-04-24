package com.discovery.theater.processor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

import com.discovery.theater.batch.Theater;

public class TheaterItemProcessor implements ItemProcessor<Theater, Theater> {

	 private static final Logger log = LoggerFactory.getLogger(TheaterItemProcessor.class);

	  @Override
	  public Theater process(final Theater theater) throws Exception {
	    final String theaterName = theater.getTheaterName().toUpperCase();
	    final String theaterCity = theater.getCity().toUpperCase();
	    final char isMaintainance = theater.getIsMaintenance();
	    int totalScreens = theater.getTotalScreens();
	    
	    final Theater transformedTheater = new Theater(theaterName, theaterCity, totalScreens, isMaintainance);

	    log.info("Converting (" + theater + ") into (" + transformedTheater + ")");
	    
	    return transformedTheater;
	  }
}
