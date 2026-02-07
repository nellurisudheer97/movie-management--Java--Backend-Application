package com.Movie.CineMatinee.Application.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Movie.CineMatinee.Application.Model.Movie;
import com.Movie.CineMatinee.Application.Service.MovieService;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.validation.Valid;
@RestController
@RequestMapping("/movies")

@CrossOrigin(
	    origins = "*",
	    allowedHeaders = "*",
	    methods = {
	        RequestMethod.GET,
	        RequestMethod.POST,
	        RequestMethod.OPTIONS
	    }
	)
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping
    public ResponseEntity<Movie> addMovie(@Valid @RequestBody Movie movie) {
        Movie savedMovie = movieService.addMovie(movie);
        return new ResponseEntity<>(savedMovie, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getMovieById(@PathVariable int id) {
        try {
            Movie movie = movieService.getMovieById(id);
            return ResponseEntity.ok(movie);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Movie not found with id " + id);
        }
    }
}

























	 




