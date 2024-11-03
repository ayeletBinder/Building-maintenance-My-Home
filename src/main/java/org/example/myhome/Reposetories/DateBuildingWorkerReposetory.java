package org.example.myhome.Reposetories;

import org.example.myhome.Models.DateBuildingWorker;
import org.example.myhome.Models.Item;
import org.example.myhome.Models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public interface DateBuildingWorkerReposetory extends JpaRepository<DateBuildingWorker,Integer> {
//    getAll
    default Optional <List<DateBuildingWorker>> GetAllDateBuildingWorkers(){
        return Optional.of(this.findAll()) ;
    }

    //    getById
    default Optional<DateBuildingWorker> GetDateBuildingWorkerById(int id) {
        return this.findById(id);
    }



//    add
    default DateBuildingWorker AddDateBuildingWorker(DateBuildingWorker DateBuildingWorker){
       return this.save(DateBuildingWorker);
    }
//    update
default DateBuildingWorker UpdateDateBuildingWorker(int id,DateBuildingWorker newDateBuildingWorker){
        return this.findById(id)
                .map(existingItem -> {
                    existingItem.setShabatOrHoliday(newDateBuildingWorker.isShabatOrHoliday());
                    existingItem.setBuildings(newDateBuildingWorker.getBuildings());
                    existingItem.setDate(newDateBuildingWorker.getDate());
                    existingItem.setEndTime(newDateBuildingWorker.getEndTime());
                    existingItem.setStartTime(newDateBuildingWorker.getStartTime());
                    existingItem.setIdPeople(newDateBuildingWorker.getIdPeople());
                    return this.save(existingItem);
                })
                .orElse(null); // אם לא נמצא אובייקט מתאים, מחזיר null
    }

    //    delete
    default boolean DeleteDateBuildingWorker(int idDateBuildingWorker){
        if (this.existsById(idDateBuildingWorker)) {
            this.deleteById(idDateBuildingWorker);
            return true;
        }
        return false;
    }
}


