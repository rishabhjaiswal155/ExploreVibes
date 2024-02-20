package com.app.Dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.Entities.Booking;
import com.app.Entities.Hotel;
import com.app.Entities.User;

public interface BookingDao extends JpaRepository<Booking, Long> {

    // Custom query to find bookings by user
    List<Booking> findByUser(User user);

    // Custom query to find bookings by hotel
    List<Booking> findByHotel(Hotel hotel);

    // Custom query to find bookings within a specific date range
    @Query("SELECT b FROM Booking b WHERE b.date BETWEEN ?1 AND ?2")
    List<Booking> findBookingsInDateRange(LocalDate startDate, LocalDate endDate);

	List<Booking> findByUserId(Long UserId);

    }