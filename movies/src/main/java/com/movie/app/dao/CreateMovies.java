package com.movie.app.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.movie.app.Dto.Movie;
@Component
public class CreateMovies {
	
	List<Movie> details=new ArrayList<>();
	@Cacheable(value="moviesInfo") 
	public void createMoviesData()
	{
	Arrays.asList(
			new Movie(1,"Avengers: Endgame"),  
            new Movie(2,"Spider-Man 2"),
            new Movie(3,"Spider-Man 2")
           );
	}
	
	
	public List<Movie> getMoviesDetails()
	{
		List<Movie> detail=new ArrayList<>();
		for(Movie movies :details)
		{
			Movie m=new Movie(movies.getMovieId(),movies.getMovieName());
			detail.add(m);
		}
		return detail;
	    
	}
	
	

}
