package com.app.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Entities.Flight;

public interface FlightDao extends JpaRepository<Flight, Long> {

    // Custom query to find flights by airline
    List<Flight> findByAirline(String airline);

    // Custom query to find flights by arrival time
    List<Flight> findByArrivalTime(String arrivalTime);

    }