package com.app.Entities;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString(exclude = {"user","tourPackage","hotel","bus","train","flight", "payments" }, callSuper = true)
public class Booking extends BaseEntity {
    private LocalDate date;
    private String paymentStatus;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "packageId")
    private TourPackage tourPackage;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "hotelId")
    private Hotel hotel;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "busId")
    private Bus bus;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "trainId")
    private Train train;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "flightId")
    private Flight flight;
    
    @OneToMany(mappedBy = "booking", cascade = CascadeType.ALL)
    private List<Payment> payments;
    

    public Booking(LocalDate date, String paymentStatus) {
		super();
		this.date = date;
		this.paymentStatus = paymentStatus;
	}

	
    

    
    }