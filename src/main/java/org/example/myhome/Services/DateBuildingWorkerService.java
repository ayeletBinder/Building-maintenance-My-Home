package org.example.myhome.Services;

import org.example.myhome.Models.DateBuildingWorker;
import org.example.myhome.Reposetories.DateBuildingWorkerReposetory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class DateBuildingWorkerService  {
    private DateBuildingWorkerReposetory dateBuildingWorkerReposetory;
    @Autowired
    public DateBuildingWorkerService(DateBuildingWorkerReposetory dateBuildingWorkerReposetory) {
        this.dateBuildingWorkerReposetory = dateBuildingWorkerReposetory;
    }
    // פונקציה להוספת פריט חדש
    public DateBuildingWorker addBuilding(DateBuildingWorker dateBuildingWorker) {
        return dateBuildingWorkerReposetory.AddDateBuildingWorker(dateBuildingWorker);
    }

    // פונקציה לעדכון פריט קיים לפי ID
    public DateBuildingWorker updateDateBuildingWorker(int id, DateBuildingWorker DateBuildingWorkerDetails) {
        return dateBuildingWorkerReposetory.UpdateDateBuildingWorker(id, DateBuildingWorkerDetails);
    }
    public Boolean deleteDateBuildingWorker(int id) {
        return dateBuildingWorkerReposetory.DeleteDateBuildingWorker(id) ;
    }
    public DateBuildingWorker getDateBuildingWorkerById(int id) {
        return dateBuildingWorkerReposetory.GetDateBuildingWorkerById(id);
    }
    public List<DateBuildingWorker> getAllDateBuildingWorkers() {
        return  dateBuildingWorkerReposetory.GetAllDateBuildingWorkers();
    }

}






