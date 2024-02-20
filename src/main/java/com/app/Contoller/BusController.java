package com.app.Contoller;
import com.app.Entities.Bus;
import com.app.Services.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/buses")
public class BusController {

    @Autowired
    private BusService busService;

    @GetMapping
    public List<Bus> getAllBuses() {
        return busService.getAllBuses();
    }

    @GetMapping("/{busId}")
    public Bus getBusById(@PathVariable Long busId) {
        return busService.getBusById(busId);
    }

    @PostMapping
    public Bus createBus(@RequestBody Bus bus) {
        return busService.createBus(bus);
    }

    @PutMapping("/{busId}")
    public Bus updateBus(@PathVariable Long busId, @RequestBody Bus bus) {
        return busService.updateBus(busId, bus);
    }

    @DeleteMapping("/{busId}")
    public void deleteBus(@PathVariable Long busId) {
        busService.deleteBus(busId);
    }

    }

