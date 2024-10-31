package org.example.myhome.Reposetories;

import org.example.myhome.Models.BuildingItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.stream.Collectors;

public interface personreposetory extends JpaRepository<BuildingItem, Integer> {
    //    getAll
    default List<BuildingItem> GetAllBuildingItems() {
        return this.findAll();
    }

    //    getById
    default BuildingItem GetBuildingItemById(int id) {
        System.out.println(this.findAll().stream().filter(x -> x.getId() == id).collect(Collectors.toList()).get(0));
        return this.findById(id).orElse(null);
    }

    //    add
    default void AddBuildingItem(BuildingItem buildingItem) {
        this.save(buildingItem);
//        return
    }

    //    update
    default BuildingItem UpdateBuildingItem(int id, BuildingItem newBuildingItem) {
        return this.findById(id)
                .map(existingItem -> {
                    existingItem.setIdBuilding(newBuildingItem.getIdBuilding());
                    existingItem.setIdItem(newBuildingItem.getIdItem());
                    return this.save(existingItem);
                })
                .orElse(null); // אם לא נמצא אובייקט מתאים, מחזיר null
    }

    //    delete
    default boolean DeleteBuildingItem(int idBuildingItem) {
        if (this.existsById(idBuildingItem)) {
            this.deleteById(idBuildingItem);
            return true;
        }
        return false;
    }
}


