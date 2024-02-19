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
public class Flight extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long flightId;
    private String airline;
    private String departureTime;
    private String arrivalTime;

    @OneToMany(mappedBy = "flight")
    private List<Booking> bookings;

    }