package com.cineticket.ticket.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ticket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int ticketId;
	
	@Column
	private String paymentStatus;
	
	@Column
	private int showId;
	
	@Column
	private int seatId;


}
