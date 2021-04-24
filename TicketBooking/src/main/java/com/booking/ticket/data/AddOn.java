package com.booking.ticket.data;

import java.util.Map;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
public class AddOn {
	private Map<String, Integer> products;
	private int amount;
}
