package com.cineticket.ticket.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Shows {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int showId;
	
	@Column
	private String name;
	
	@Column
	private int movieId;
	
}
