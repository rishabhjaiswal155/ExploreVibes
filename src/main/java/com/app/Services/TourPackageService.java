package com.app.Services;

import com.app.Entities.TourPackage;
import com.app.Dao.TourPackageDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TourPackageService {

    @Autowired
    private TourPackageDao tourPackageDao;

    public List<TourPackage> getAllTourPackages() {
        return tourPackageDao.findAll();
    }

    public TourPackage getTourPackageById(Long packageId) {
        return tourPackageDao.findById(packageId).orElse(null);
    }

    public TourPackage createTourPackage(TourPackage tourPackage) {
        return tourPackageDao.save(tourPackage);
    }

    public TourPackage updateTourPackage(Long packageId, TourPackage tourPackage) {
        if (tourPackageDao.existsById(packageId)) {
            tourPackage.setId(packageId);
            return tourPackageDao.save(tourPackage);
        } else {
            return null; // Handle not found scenario
        }
    }

    public void deleteTourPackage(Long packageId) {
        tourPackageDao.deleteById(packageId);
    }

	public List<TourPackage> getTourPackagesByName(String packageName) {
		// TODO Auto-generated method stub
		  return tourPackageDao.findByPackageName(packageName);
	}


}
