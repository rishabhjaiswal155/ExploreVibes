package com.app.Entities;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString(exclude = { "hotel"}, callSuper = true)
public class Room extends BaseEntity {
   
    private String roomNumber;
    @Enumerated(EnumType.STRING)	
    private RoomType roomtype;
    private double fare;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;

	public Room(String roomNumber, RoomType roomtype, double fare, Hotel hotel) {
		super();
		this.roomNumber = roomNumber;
		this.roomtype = roomtype;
		this.fare = fare;
		this.hotel = hotel;
	}
    
}