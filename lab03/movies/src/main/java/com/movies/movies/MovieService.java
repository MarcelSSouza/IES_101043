package com.movies.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public Movie getMovieById(long id) {
        return movieRepository.findById(id).get();
    }

    public Iterable<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public void deleteMovieById(long id) {
        movieRepository.deleteById(id);
    }

    public Movie updateMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public Movie addQuoteToMovie(long id, Quote quote) {
        Movie movie = getMovieById(id);
        movie.getQuotes().add(quote);
        return movieRepository.save(movie);
    }

    public Movie deleteQuoteFromMovie(long id, Quote quote) {
        Movie movie = getMovieById(id);
        movie.getQuotes().remove(quote);
        return movieRepository.save(movie);
    }




}
