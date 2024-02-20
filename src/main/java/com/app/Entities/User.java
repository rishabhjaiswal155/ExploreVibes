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
public class User extends BaseEntity {
    private String name;
    private String address;
    private String email;
    private String phone;
    private String password;
    private String role;
    
    @JsonIgnore
     @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Booking> bookings;


	public User(String name, String address, String email, String phone, String password, String role) {
		super();
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.role = role;
	}
     
     

    
 }