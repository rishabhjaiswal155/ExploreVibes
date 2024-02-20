package com.app.Services;
import com.app.Entities.Bus;
import com.app.Dao.BusDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusService {

    @Autowired
    private BusDao busDao;

    public List<Bus> getAllBuses() {
        return busDao.findAll();
    }

    public Bus getBusById(Long busId) {
        return busDao.findById(busId).orElse(null);
    }

    public Bus createBus(Bus bus) {
        return busDao.save(bus);
    }

    public Bus updateBus(Long busId, Bus bus) {
        if (busDao.existsById(busId)) {
            bus.setId(busId);
            return busDao.save(bus);
        } else {
            return null; // Handle not found scenario
        }
    }

    public void deleteBus(Long busId) {
        busDao.deleteById(busId);
    }
}

