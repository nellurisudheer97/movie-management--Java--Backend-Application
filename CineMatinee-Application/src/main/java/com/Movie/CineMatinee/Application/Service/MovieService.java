package com.Movie.CineMatinee.Application.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Movie.CineMatinee.Application.Exception.MovieNotFoundException;
import com.Movie.CineMatinee.Application.Model.Movie;
@Service//here it is the annotation for service layer
public class MovieService {
	List<Movie> movies = new ArrayList<>();
	private int idCounter = 1;
	
	public Movie addMovie(Movie movie) {
	    movie.setId(idCounter++);
	    movies.add(movie);
	    return movie;
	}
	
	public Movie getMovieById(int id) {
	    for (Movie movie : movies) {
	        if (movie.getId() == id) {
	            return movie;
	        }
	    }
	    throw new MovieNotFoundException("Movie not found with id: " + id);
	}


	 


}
