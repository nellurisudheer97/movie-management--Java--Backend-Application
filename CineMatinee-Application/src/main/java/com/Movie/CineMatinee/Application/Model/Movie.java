package com.Movie.CineMatinee.Application.Model;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;


//This is the model with some specific fields
public class Movie {
	private Integer id;
	@NotBlank(message = "Movie name is must required")
	private String name;
	@NotBlank(message = "Description is required for overview of this movie")
	private String description;
	@NotBlank(message = "Movie genre is must enter because audience know about kind of movie")
	private String genre;
	@Min(value = 10, message = "Duration must be at least 10 minutes")
	private long durationMinutes;
	@DecimalMin(value = "0.0", inclusive = false, message = "Rating of the movie will be greater than 0")
    @DecimalMax(value = "10.0", message = "Rating of the movie will be less than or equal to 10")
	private double rating;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public long getDurationMinutes() {
		return durationMinutes;
	}
	public void setDurationMinutes(long durationMinutes) {
		this.durationMinutes = durationMinutes;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	//ToString Method
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", description=" + description + ", genre=" + genre
				+ ", durationMinutes=" + durationMinutes + ", rating=" + rating + "]";
	}
	//default constructor
	public Movie() {
    }
	//this is the parametorized constructor
	public Movie(Integer id, String name, String description, String genre, long durationMinutes, double rating) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.genre= genre;
		this.durationMinutes = durationMinutes;
		this.rating = rating;
	}
	
	
}
	


 