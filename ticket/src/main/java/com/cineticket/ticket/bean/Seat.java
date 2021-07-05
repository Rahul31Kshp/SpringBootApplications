package com.cineticket.ticket.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Seat {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int seatId;
	
	@Column
	private String seatType;
	
	@Column
	private String name;
}
