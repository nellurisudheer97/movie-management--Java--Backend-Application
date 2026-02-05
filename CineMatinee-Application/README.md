##Title: CineMatinee – Movie Management Application

Project Overview:CineMatinee is a Spring Boot backend application that I built to manage movie data through RESTful APIs.
The application allows users to add movies and retrieve movie details using a unique ID.

This project focuses on core backend concepts such as REST APIs, layered architecture, input validation, and global exception handling, without using any database.

I Followed some Architecture to design the application

###Architecture & Design:
I Classified the application into various layers such as
##Model layer – Represents movie Related data and some validation rules
##Service layer – This layer contains business logic and manages data of the project
##Controller layer – This layer handles the HTTP requests and responses

I explained the Project from each layers

###Model Layer-Movie
-->The Layer which detailing Every individual information of project Data and Validations

It contains some fields such as:

Id
Movie name
Description
Genre
Duration in minutes
Rating

I added input validation directly in the model using Bean Validation annotations to ensure:
Mandatory fields are not empty
Duration is a positive number
Rating stays within a valid range (0–10)


###Service Layer-MovieService
This is Main layer of this project, Because it have business logic.
I implemented in-memory storage using an ArrayList instead of any Database
Stores movies temporarily in memory
Automatically generates unique IDs for each movie
Handles logic for adding and retrieving movies
Throws a custom exception when a movie is not found

This layer acts like a temporary database and demonstrates how backend logic works internally.

###Controller Layer -MovieController

This layer works as a Calling API'S Efficiently

In this project I implemented only two mapping such as  post mapping and get mapping
POST /movies → Add a new movie
GET /movies/{id} → Fetch movie details by ID


Steps how postman works as a validating tool

-->The API Accepts JSON input
-->Triggers validation using @Valid
Delegates logic to the service layer
Returns proper HTTP status codes


###Exception Handling

This is the one of the good layer avoid the Exceptions
###I implemented a Global Exception Handler using @ControllerAdvice to manage errors centrally.

By this Handler it handles the
Validation errors (400 Bad Request)
Movie not found scenarios (404 Not Found)
Unexpected runtime errors (500 Internal Server Error)

Coming to data Storage I use ArrayList instead of database it doesnot store the data permanently.
	Data exists only while the application is running
	All data is lost when the application restarts

###Technical Stack used in project::::
Java
SpringBoot(Dependencies-spring web, Spring dev tools and validation)
Tools: Eclipse and Postman

###Finally how the application works I can overview with some key points

Client sends a request (Postman or browser)
Controller receives and validates input
Service layer processes logic
Data is stored or retrieved from memory
Response is returned to the client


	







