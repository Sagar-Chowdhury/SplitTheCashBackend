package com.example.SplitTheCash.repositories;

import java.util.*;

import com.example.SplitTheCash.entities.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface TripRepository extends JpaRepository<Trip,String> {
     Trip findByTitle(String title);

     @Query(value = """
             SELECT *
             FROM Trip as t INNER JOIN Trip_Members as tm
             ON tm.trip_id=t.id WHERE  tm.member_id = '33333333-3333-3333-3333-333333333333';
             """)
     List<Trip> getAllTripsByMemberId(int member_id);

}
