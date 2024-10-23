package com.example.quickrideoct24.controllers;

import com.example.quickrideoct24.dtos.ProposeRideRequestDto;
import com.example.quickrideoct24.dtos.ProposeRideResponseDto;
import com.example.quickrideoct24.models.Ride;
import com.example.quickrideoct24.services.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rides")
public class RideController {
    private RideService rideService;

    public RideController(RideService rideService) {
        this.rideService = rideService;
    }

    @PostMapping()
    public ProposeRideResponseDto proposeRide(@RequestBody ProposeRideRequestDto requestDto) {
        Ride ride = rideService.proposeRide();

        return new ProposeRideResponseDto();
    }
}
