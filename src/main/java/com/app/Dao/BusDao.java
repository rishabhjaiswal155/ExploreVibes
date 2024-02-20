package com.app.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.Entities.Bus;

public interface BusDao extends JpaRepository<Bus, Long> {

    

    // Custom query to find buses by departure time
    List<Bus> findByDepartureTime(String departureTime);

    
}
