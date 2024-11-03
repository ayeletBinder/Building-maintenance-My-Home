package org.example.myhome.Reposetories;

import org.example.myhome.Models.DateBuildingWorker;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.stream.Collectors;

public interface DateBuildingWorkerReposetory extends JpaRepository<DateBuildingWorker,Integer> {
//    getAll
    default List<DateBuildingWorker> GetAllDateBuildingWorkers(){
        return  this.findAll();
    }
//    getById
    default  DateBuildingWorker GetDateBuildingWorkerById(int id){
        System.out.println( this.findAll().stream().filter(x->x.getId()==id).collect(Collectors.toList()).get(0) );
        return this.findById(id).orElse(null);    }
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


