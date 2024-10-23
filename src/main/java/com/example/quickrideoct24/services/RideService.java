package com.example.quickrideoct24.services;

import com.example.quickrideoct24.models.Ride;
import org.springframework.stereotype.Service;

@Service
public class RideService {
    public Ride proposeRide() {
        return new Ride();
    }
}
