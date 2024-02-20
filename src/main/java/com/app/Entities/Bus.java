package com.app.Entities;

import java.time.LocalDate;
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
public class Bus extends BaseEntity {
    
    private String source;
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private LocalDate departureDate;
     @JsonIgnore
    @OneToMany(mappedBy = "bus", cascade = CascadeType.ALL)
    private List<Booking> bookings;

	public Bus(String source, String destination, String departureTime, String arrivalTime, LocalDate departureDate) {
		super();
		this.source = source;
		this.destination = destination;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.departureDate = departureDate;
	}
    
    

    }