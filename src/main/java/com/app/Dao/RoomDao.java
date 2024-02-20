package com.app.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Entities.Hotel;
import com.app.Entities.Room;

public interface RoomDao extends JpaRepository<Room, Long> {

    // Custom query to find rooms in a specific hotel
    List<Room> findByHotel(Hotel hotel);
}