package com.app.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.Entities.Train;

public interface TrainDao extends JpaRepository<Train, Long> {

    // Custom query to find trains by departure time
    List<Train> findByDepartureTime(String departureTime);

//    // Custom query to find trains with available seats
//    @Query("SELECT DISTINCT t FROM Train t JOIN FETCH t.bookings bk WHERE size(bk) < t.totalSeats")
//    List<Train> findTrainsWithAvailableSeats();

}