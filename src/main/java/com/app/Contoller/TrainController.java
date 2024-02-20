package com.app.Contoller;


import com.app.Entities.Train;
import com.app.Services.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trains")
public class TrainController {

    @Autowired
    private TrainService trainService;

    @GetMapping
    public List<Train> getAllTrains() {
        return trainService.getAllTrains();
    }

    @GetMapping("/{trainId}")
    public Train getTrainById(@PathVariable Long trainId) {
        return trainService.getTrainById(trainId);
    }

    @PostMapping
    public Train createTrain(@RequestBody Train train) {
        return trainService.createTrain(train);
    }

    @PutMapping("/{trainId}")
    public Train updateTrain(@PathVariable Long trainId, @RequestBody Train train) {
        return trainService.updateTrain(trainId, train);
    }

    @DeleteMapping("/{trainId}")
    public void deleteTrain(@PathVariable Long trainId) {
        trainService.deleteTrain(trainId);
    }

}

