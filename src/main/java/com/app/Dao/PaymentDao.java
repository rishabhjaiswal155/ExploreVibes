package com.app.Dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Entities.Booking;
import com.app.Entities.Payment;

public interface PaymentDao extends JpaRepository<Payment, Long> {

    // Custom query to find payments by booking
    List<Payment> findByBooking(Booking booking);

    // Custom query to find payments made after a certain date
    List<Payment> findByPaymentDateAfter(LocalDate date);

	List<Payment> findByPaymentStatus(String paymentStatus);

}
