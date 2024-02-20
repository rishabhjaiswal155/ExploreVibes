package com.app.Dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.Entities.User;

public interface UserDao extends JpaRepository<User, Long> {

    // Custom query to find users by name
    List<User> findByName(String name);

    // Custom query to find users by phone number
    User findByPhone(String phone);

    // Custom query to find users by email and address
    User findByEmailAndAddress(String email, String address);

    // Custom query to find users with bookings in a specific date range
    @Query("SELECT DISTINCT u FROM User u JOIN FETCH u.bookings b WHERE b.date BETWEEN ?1 AND ?2")
    List<User> findUsersWithBookingsInDateRange(LocalDate startDate, LocalDate endDate);

	User findByEmail(String email);

 
}