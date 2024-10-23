package com.example.quickrideoct24.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "vehicles")
public class Vehicle extends BaseModel {
    private String name;
    private String number;
    // private Driver ownerName;
    @Enumerated(EnumType.ORDINAL)
    private VehicleType vehicleType;
    private int seatCount;
    @ManyToOne
    private Driver driver;
}
