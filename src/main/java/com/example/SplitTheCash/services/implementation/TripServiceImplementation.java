package com.example.SplitTheCash.services.implementation;

import com.example.SplitTheCash.entities.Member;
import com.example.SplitTheCash.entities.Trip;
import com.example.SplitTheCash.repositories.MemberRepository;
import com.example.SplitTheCash.repositories.TripRepository;
import com.example.SplitTheCash.services.TripService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TripServiceImplementation implements TripService {

    @Autowired
    private TripRepository tripRepository;
    @Autowired
    private MemberRepository memberRepository;


    @Override
    public Trip createTrip(Trip trip) {
       return tripRepository.save(trip);
    }

    @Override
    public Trip getTripById(String tripId) {
        return tripRepository.findById(tripId)
                .orElseThrow(() -> new RuntimeException("Trip not found"));
    }

    @Override
    public List<Trip> getAllTrips() {
        return tripRepository.findAll(); // Fetch all trips
    }

    @Override
    public void addMemberToTrip(String tripId, Member member) {

    }
}
