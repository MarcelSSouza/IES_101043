package com.movies.movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  QuoteRepository extends JpaRepository<Quote, Long>{


    
}