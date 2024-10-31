package org.example.myhome.Services;

import org.example.myhome.Models.Bilding;
import org.example.myhome.Reposetories.BildingReposetory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BildingService  {
    private final BildingReposetory buildingRepository;
    @Autowired
    public BildingService(BildingReposetory buildingRepository) {
        this.buildingRepository = buildingRepository;
    }
    // פונקציה להוספת פריט חדש
    public Bilding addBuilding(Bilding building) {
        return buildingRepository.AddBilding(building);
    }

    // פונקציה לעדכון פריט קיים לפי ID
    public Bilding updateBilding(int id, Bilding BildingDetails) {
            return buildingRepository.UpdateBilding(id, BildingDetails);
    }
    public Boolean deleteBilding(int id) {
        return buildingRepository.DeleteBilding(id) ;
    }
    public Bilding getBildingById(int id) {
        return buildingRepository.GetBildingById(id);
    }
    public List<Bilding> getAllBildings() {
        return  buildingRepository.GetAllBildings();
    }

}
