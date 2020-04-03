package com.movie.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.movie.app.Dto.Movie;
import com.movie.app.service.MovieService;

@RestController
@RequestMapping("/movie")
public class MovieController {
	@Autowired
	MovieService movieService ;
	
	@Cacheable(value="moviesInfo")  
	@GetMapping
	public List<Movie> getmoviesInformation()  
	{  
	return movieService.getmoviesInformation();
	}
	
	

}
