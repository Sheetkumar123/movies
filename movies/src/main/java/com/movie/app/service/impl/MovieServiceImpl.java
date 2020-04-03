package com.movie.app.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.movie.app.Dto.Movie;
import com.movie.app.dao.CreateMovies;
import com.movie.app.service.MovieService;
@Service
public class MovieServiceImpl implements MovieService {
	
	
	CreateMovies createMovies=new CreateMovies();
	
	@Override
	public List<Movie> getmoviesInformation() 
	{
		return createMovies.getMoviesDetails();
		
	}

}
