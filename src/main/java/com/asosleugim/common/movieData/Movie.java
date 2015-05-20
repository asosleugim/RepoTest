package com.asosleugim.common.movieData;

import java.util.Date;

public class Movie {

	private String name;
	private Date movieStartTime;
	private Date currentTime;
	private String movieLocation;
	private String movieType;

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

}
