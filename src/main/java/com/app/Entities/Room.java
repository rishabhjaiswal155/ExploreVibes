package com.app.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Room extends BaseEntity {
   
    private String type;

    @ManyToOne
    @JoinColumn(name = "hotelId")
    private Hotel hotel;
}