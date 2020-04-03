package com.movie.app.Dto;


/**
 * @author Sheet Kumar
 *
 */

public class Movie {
	
	private Integer movieId;
	private String movieName;
	/**
	 * @return the movieId
	 */
	public Integer getMovieId() {
		return movieId;
	}
	/**
	 * @param movieId the movieId to set
	 */
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	/**
	 * @return the movieName
	 */
	public String getMovieName() {
		return movieName;
	}
	/**
	 * @param movieName the movieName to set
	 */
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Movie(Integer movieId, String movieName) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
	}
	
	

	
}
