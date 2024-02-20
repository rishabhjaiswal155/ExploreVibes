package com.app.Dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.Entities.Hotel;

public interface HotelDao extends JpaRepository<Hotel, Long> {

    // Custom query to find hotels with a minimum rating
    List<Hotel> findByRatingGreaterThanEqual(String rating);

    // Custom query to find hotels in a specific location
    List<Hotel> findByLocation(String location);

    // Custom query to find hotels with available rooms
    @Query("SELECT DISTINCT h FROM Hotel h JOIN FETCH h.rooms r WHERE r IS NOT NULL")
    List<Hotel> findHotelsWithAvailableRooms();

}