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
public class Hotel extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hotelId;
    private String name;
    private String location;
    private String rating;

    @OneToMany(mappedBy = "hotel")
    private List<Booking> bookings;

    @OneToMany(mappedBy = "hotel")
    private List<Room> rooms;

  }