package com.movies.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping("/movies")
    public Iterable<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }
    @PostMapping("/movies")
    public Movie createMovie(@RequestBody Movie movie) {
        return movieService.saveMovie(movie);
    }
    @DeleteMapping("/movies")
    public void deleteMovie(@RequestBody Movie movie) {
        movieService.deleteMovieById(movie.getId());
    }
    @PostMapping("/moviesUpdate")
    public Movie updateMovie(@RequestBody Movie movie) {
        return movieService.updateMovie(movie);
    }
    @PostMapping("/movies/{id}/quotes")
    public Movie addQuoteToMovie(@PathVariable long id, @RequestBody Quote quote) {
        return movieService.addQuoteToMovie(id, quote);
    }
    @DeleteMapping("/movies/{id}/quotes")
    public Movie deleteQuoteFromMovie(@PathVariable long id, @RequestBody Quote quote) {
        return movieService.deleteQuoteFromMovie(id, quote);
    }
    @PostMapping ("/quotes")
    public Quote createQuote(@RequestBody Quote quote) {
        return quote;
    }
}
