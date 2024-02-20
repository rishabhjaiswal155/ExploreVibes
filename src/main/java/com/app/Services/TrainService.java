package com.app.Services;


import com.app.Entities.Train;
import com.app.Dao.TrainDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainService {

    @Autowired
    private TrainDao trainDao;

    public List<Train> getAllTrains() {
        return trainDao.findAll();
    }

    public Train getTrainById(Long trainId) {
        return trainDao.findById(trainId).orElse(null);
    }

    public Train createTrain(Train train) {
        return trainDao.save(train);
    }

    public Train updateTrain(Long trainId, Train train) {
        if (trainDao.existsById(trainId)) {
            train.setId(trainId);
            return trainDao.save(train);
        } else {
            return null; // Handle not found scenario
        }
    }

    public void deleteTrain(Long trainId) {
        trainDao.deleteById(trainId);
    }
}

