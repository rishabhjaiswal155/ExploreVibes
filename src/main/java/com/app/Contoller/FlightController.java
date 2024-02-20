package com.app.Contoller;
import com.app.Entities.Flight;
import com.app.Services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @GetMapping
    public List<Flight> getAllFlights() {
        return flightService.getAllFlights();
    }

    @GetMapping("/{flightId}")
    public Flight getFlightById(@PathVariable Long flightId) {
        return flightService.getFlightById(flightId);
    }

    @PostMapping
    public Flight createFlight(@RequestBody Flight flight) {
        return flightService.createFlight(flight);
    }

    @PutMapping("/{flightId}")
    public Flight updateFlight(@PathVariable Long flightId, @RequestBody Flight flight) {
        return flightService.updateFlight(flightId, flight);
    }

    @DeleteMapping("/{flightId}")
    public void deleteFlight(@PathVariable Long flightId) {
        flightService.deleteFlight(flightId);
    }

    // Additional custom endpoint example
    @GetMapping("/byAirline/{airline}")
    public List<Flight> getFlightsByAirline(@PathVariable String airline) {
        return flightService.getFlightsByAirline(airline);
    }
}
