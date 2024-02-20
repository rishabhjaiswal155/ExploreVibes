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
@ToString(exclude = { "bookings"}, callSuper = true)
public class Train extends BaseEntity {

    private String trainName;
    private String source;
    private String destination;
    private LocalDate departureDate;
    private String departureTime;
    private String arrivalTime;
    @JsonIgnore
    @OneToMany(mappedBy = "train",cascade = CascadeType.ALL)
    private List<Booking> bookings;

	public Train(String trainName, String source, String destination, LocalDate departureDate, String departureTime,
			String arrivalTime) {
		super();
		this.trainName = trainName;
		this.source = source;
		this.destination = destination;
		this.departureDate = departureDate;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
	}
    
    

 }