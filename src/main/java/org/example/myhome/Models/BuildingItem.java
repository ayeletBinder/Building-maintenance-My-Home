package org.example.myhome.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BuildingItem {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int idBuilding;
    private int idItem;
    
    public BuildingItem() {
    }

    public int getId() {
        return id;
    }

    public int getIdBuilding() {
        return idBuilding;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdBuilding(int idBuilding) {
        this.idBuilding = idBuilding;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }
}
