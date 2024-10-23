package com.example.quickrideoct24.models;

import com.fasterxml.jackson.databind.ser.Serializers;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@MappedSuperclass
public class User extends BaseModel {
    private String name;
    private String email;
    private String password;
    private String gender;
    private double rating;
    private UserType userType;
}


/*
1. Mapped Super class.
2. Joined Table
3. Table per class.
4. Single Table.
 */