package com.movies.movies;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.lang.String;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{


    
}