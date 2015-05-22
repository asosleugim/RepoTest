package com.asosleugim.common.movieData;

import java.util.Date;

public class Movie {

	private String name;
	private Date movieStartTime;
	private Date currentTime;
	private String movieLocation;
	private String movieType;
	private Integer ticketPrice;
	private String theatherName;

	public void setMovieStartTime(Date movieStartTime) {
		this.movieStartTime = movieStartTime;
	}

	public void setCurrentTime(Date currentTime) {
		this.currentTime = currentTime;
	}



	public String getName() {
		return name;
	}

	public String getMovieType() {
		return movieType;
	}

	public void setMovieType(String movieType) {
		this.movieType = movieType;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getMovieStartTime() {
		return movieStartTime;
	}

	public Date getCurrentTime() {
		return currentTime;
	}

	public String getMovieLocation() {
		return movieLocation;
	}

	public void setMovieLocation(String movieLocation) {
		this.movieLocation = movieLocation;
	}

	public Integer getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(Integer ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public String getTheatherName() {
		return theatherName;
	}

	public void setTheatherName(String theatherName) {
		this.theatherName = theatherName;
	}

}
