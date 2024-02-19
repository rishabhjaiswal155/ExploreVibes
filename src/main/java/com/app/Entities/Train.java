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
public class Train extends BaseEntity {

    private String trainName;
    private String departureTime;
    private String arrivalTime;

    @OneToMany(mappedBy = "train")
    private List<Booking> bookings;

 }