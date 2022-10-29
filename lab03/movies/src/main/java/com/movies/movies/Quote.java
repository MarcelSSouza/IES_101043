package com.movies.movies;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Quotes")
public class Quote {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String quote;

    @ManyToOne
    @JoinColumn(name="MOV_ID", nullable=false)    
    public Movie movie;

    


    public Quote() {
    }

    public Quote(String quote) {
        this.quote = quote;
    }

    public Quote(String quote, Movie movie) {
        this.quote = quote;
        this.movie = movie;
    }


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
