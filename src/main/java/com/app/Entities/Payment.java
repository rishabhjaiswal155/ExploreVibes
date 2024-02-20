package com.app.Entities;

import java.time.LocalDate;

import javax.persistence.Entity;
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
@ToString(exclude = { "booking"}, callSuper = true)
public class Payment extends BaseEntity {
    private double amount;
    private LocalDate paymentDate;
    private boolean paymentStatus;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "bookingId")
    private Booking booking;

	public Payment(double amount, LocalDate paymentDate,boolean paymentStatus) {
		super();
		this.amount = amount;
		this.paymentDate = paymentDate;
		this.paymentStatus=paymentStatus;
	}
    
    

}