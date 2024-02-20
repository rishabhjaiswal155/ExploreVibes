package com.app.Services;

import com.app.Entities.Flight;
import com.app.Dao.FlightDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {

    @Autowired
    private FlightDao flightDao;

    public List<Flight> getAllFlights() {
        return flightDao.findAll();
    }

    public Flight getFlightById(Long flightId) {
        return flightDao.findById(flightId).orElse(null);
    }

    public Flight createFlight(Flight flight) {
        return flightDao.save(flight);
    }

    public Flight updateFlight(Long flightId, Flight flight) {
        if (flightDao.existsById(flightId)) {
            flight.setId(flightId);
            return flightDao.save(flight);
        } else {
            return null; // Handle not found scenario
        }
    }

    public void deleteFlight(Long flightId) {
        flightDao.deleteById(flightId);
    }

    // Additional custom method example
    public List<Flight> getFlightsByAirline(String airline) {
        return flightDao.findByAirline(airline);
    }
}
