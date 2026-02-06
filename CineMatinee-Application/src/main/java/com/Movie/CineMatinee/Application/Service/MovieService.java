package com.Movie.CineMatinee.Application.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.Movie.CineMatinee.Application.Model.Movie;

@Service
public class MovieService {

    private List<Movie> movies = new ArrayList<>();
    private int idCounter = 1; // auto-increment ID

    //here we can add movies 
    public Movie addMovie(Movie movie) {
        movie.setId(idCounter++);   // ✅ assign ID
        movies.add(movie);
        return movie;
    }

    // we can get the movie details by Id

public Movie getMovieById(int id) {
    for (Movie movie : movies) {
        if (movie.getId() == id) {
            return movie;
        }
    }

    throw new RuntimeException("Movie not found with id " + id);
}


}
