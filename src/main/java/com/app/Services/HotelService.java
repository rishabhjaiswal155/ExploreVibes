package com.app.Services;


import com.app.Entities.Hotel;
import com.app.Dao.HotelDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {

    @Autowired
    private HotelDao hotelDao;

    public List<Hotel> getAllHotels() {
        return hotelDao.findAll();
    }

    public Hotel getHotelById(Long hotelId) {
        return hotelDao.findById(hotelId).orElse(null);
    }

    public Hotel createHotel(Hotel hotel) {
        return hotelDao.save(hotel);
    }

    public Hotel updateHotel(Long hotelId, Hotel hotel) {
        if (hotelDao.existsById(hotelId)) {
            hotel.setId(hotelId);
            return hotelDao.save(hotel);
        } else {
            return  null; 
        }
    }

    public void deleteHotel(Long hotelId) {
        hotelDao.deleteById(hotelId);
    }

    // Additional custom method example
    public List<Hotel> getHotelsByLocation(String location) {
        return hotelDao.findByLocation(location);
    }
}

