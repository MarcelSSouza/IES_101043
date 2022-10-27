package com.movies.movies;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Quote {
    private long id;
    private String quote;
    @ManyToOne  
    private Movie movie;  
    public Quote() {
    }
    public Quote(String quote, Movie movie) {
        this.quote = quote;
        this.movie = movie;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Quote id(long id) {
        setId(id);
        return this;
    }

    public Quote quote(String quote) {
        setQuote(quote);
        return this;
    }


}
