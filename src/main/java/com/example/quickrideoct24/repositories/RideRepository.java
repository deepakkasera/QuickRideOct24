package com.example.quickrideoct24.repositories;

import com.example.quickrideoct24.models.Ride;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RideRepository extends JpaRepository<Ride, Long> {
    @Override
    Optional<Ride> findById(Long rideId);
}
