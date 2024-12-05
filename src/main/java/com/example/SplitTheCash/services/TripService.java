package com.example.SplitTheCash.services;

import com.example.SplitTheCash.entities.Member;
import com.example.SplitTheCash.entities.Trip;

import java.util.List;

public interface TripService {
    Trip createTrip(Trip trip);
    Trip getTripById(String tripId);
    List<Trip> getAllTrips();
    void addMemberToTrip(String tripId, Member member);
}

