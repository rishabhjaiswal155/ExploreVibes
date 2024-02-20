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
@ToString(exclude = { "bookings"}, callSuper = true)
public class TourPackage extends BaseEntity {
   
    private String packageName;
    private String description;
    private double price;
    private String place;
    private int numberOfDays;
    private int numberOfPersons;
@JsonIgnore
    @OneToMany(mappedBy = "tourPackage",cascade = CascadeType.ALL)
    private List<Booking> bookings;

	public TourPackage(String packageName, String description, double price, String place, int numberOfDays,
			int numberOfPersons) {
		super();
		this.packageName = packageName;
		this.description = description;
		this.price = price;
		this.place = place;
		this.numberOfDays = numberOfDays;
		this.numberOfPersons = numberOfPersons;
	}
    

}