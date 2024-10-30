package org.example.myhome.Services;

import org.example.myhome.Models.Bilding;
import org.example.myhome.Models.Bilding;
import org.example.myhome.Reposetories.BildingReposetory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BildingService  {
    @Autowired
    private BildingReposetory buildingRepository;

    // פונקציה להוספת פריט חדש
    public Bilding addBuilding(Bilding building) {
        return buildingRepository.AddBilding(building);
    }

    // פונקציה לעדכון פריט קיים לפי ID
    public Bilding updateBilding(int id, Bilding BildingDetails) {
            return buildingRepository.UpdateBilding(id, BildingDetails);
    }
}
