package com.Movie.CineMatinee.Application.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Movie.CineMatinee.Application.Model.Movie;
import com.Movie.CineMatinee.Application.Service.MovieService;

import jakarta.validation.Valid;

@RestController//This is the annotation , it is the Controller class
@RequestMapping("/movies")
public class MovieController {

    private final MovieService movieService;

    
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    // we can add new movie into the ArrayList
    @PostMapping
    public ResponseEntity<Movie> addMovie( @Valid @RequestBody Movie movie) {
        Movie savedMovie = movieService.addMovie(movie);
        return new ResponseEntity<>(savedMovie, HttpStatus.CREATED);
    }

    //we can fetch or get the movie details by using thier Id
    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable int id) {
        Movie movie = movieService.getMovieById(id);
        return ResponseEntity.ok(movie);
    }
}
