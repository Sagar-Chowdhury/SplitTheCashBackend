package com.example.SplitTheCash.repositories;

import com.example.SplitTheCash.entities.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TripRepository extends JpaRepository<Trip,String> {
     Trip findByTitle(String title);
}
