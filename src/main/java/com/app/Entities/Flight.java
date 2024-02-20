package com.app.Entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString(exclude = { "bookings" }, callSuper = true)
public class Flight extends BaseEntity {
    private String airline;
    private String departureTime;
    private String arrivalTime;
    @JsonIgnore
    @OneToMany(mappedBy = "flight", cascade = CascadeType.ALL)
    private List<Booking> bookings;

	public Flight(String airline, String departureTime, String arrivalTime) {
		super();
		this.airline = airline;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
	}

    
    }