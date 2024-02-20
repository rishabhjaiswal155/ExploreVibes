package com.app.Contoller;


import com.app.Entities.TourPackage;
import com.app.Services.TourPackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tourPackages")
public class TourPackageController {

    @Autowired
    private TourPackageService tourPackageService;

    @GetMapping
    public List<TourPackage> getAllTourPackages() {
        return tourPackageService.getAllTourPackages();
    }

    @GetMapping("/{packageId}")
    public TourPackage getTourPackageById(@PathVariable Long packageId) {
        return tourPackageService.getTourPackageById(packageId);
    }

    @PostMapping
    public TourPackage createTourPackage(@RequestBody TourPackage tourPackage) {
        return tourPackageService.createTourPackage(tourPackage);
    }

    @PutMapping("/{packageId}")
    public TourPackage updateTourPackage(@PathVariable Long packageId, @RequestBody TourPackage tourPackage) {
        return tourPackageService.updateTourPackage(packageId, tourPackage);
    }

    @DeleteMapping("/{packageId}")
    public void deleteTourPackage(@PathVariable Long packageId) {
        tourPackageService.deleteTourPackage(packageId);
    }

    // Additional custom endpoint example
    @GetMapping("/byName/{packageName}")
    public List<TourPackage> getTourPackagesByName(@PathVariable String packageName) {
        return tourPackageService.getTourPackagesByName(packageName);
    }
}
