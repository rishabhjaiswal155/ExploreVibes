package com.app.Dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.Entities.TourPackage;

public interface TourPackageDao extends JpaRepository<TourPackage, Long> {

	 List<TourPackage> findByPackageName(String packageName);
    // Custom query to find tour packages with descriptions containing a specific keyword
    @Query("SELECT tp FROM TourPackage tp WHERE LOWER(tp.description) LIKE LOWER(CONCAT('%', ?1, '%'))")
    List<TourPackage> findByDescriptionContainingKeyword(String keyword);

    // Custom query to find tour packages with prices between a specified range
    List<TourPackage> findByPriceBetween(double minPrice, double maxPrice);
   


}
