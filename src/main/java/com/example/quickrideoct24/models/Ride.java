package com.example.quickrideoct24.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "rides")
public class Ride extends BaseModel {
    private String source;
    private String destination;
    private int amount;
    private int availableSeatCounts;

    @ManyToOne
    private Driver driver;

    @ManyToOne
    private Vehicle vehicle;

    @ManyToMany
    private List<Passenger> passengers;
}


/*
  1                1
Ride ---------- Driver => M:1
  M                1

 1                 1
Ride ---------- Vehicle => M:1
 M                 1
 */