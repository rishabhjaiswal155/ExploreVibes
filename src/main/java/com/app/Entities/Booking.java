package com.app.Entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Booking extends BaseEntity {
    private LocalDate date;
    private String paymentStatus;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "packageId")
    private TourPackage tourPackage;

    @ManyToOne
    @JoinColumn(name = "hotelId")
    private Hotel hotel;

    @ManyToOne
    @JoinColumn(name = "busId")
    private Bus bus;

    @ManyToOne
    @JoinColumn(name = "trainId")
    private Train train;

    @ManyToOne
    @JoinColumn(name = "flightId")
    private Flight flight;

    @OneToMany(mappedBy = "booking")
    private List<Payment> payments;

    }