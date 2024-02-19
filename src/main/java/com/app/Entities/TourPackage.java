package com.app.Entities;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class TourPackage extends BaseEntity {
   
    private String name;
    private String description;
    private double price;

    @OneToMany(mappedBy = "tourPackage")
    private List<Booking> bookings;

}