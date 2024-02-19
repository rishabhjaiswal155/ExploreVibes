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
public class User extends BaseEntity {
    private String name;
    private String address;
    private String email;
    private String phone;

    @OneToMany(mappedBy = "user")
    private List<Booking> bookings;

 }