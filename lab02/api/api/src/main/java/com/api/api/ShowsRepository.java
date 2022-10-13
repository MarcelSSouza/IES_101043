package com.api.api;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ShowsRepository extends JpaRepository<ShowsDB, Long> {
}




