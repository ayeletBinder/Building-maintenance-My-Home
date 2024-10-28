package org.example.myhome.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MemberBuilding {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private int idBuilding;
    private int idMember;

    public MemberBuilding() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdBuilding(int idBuilding) {
        this.idBuilding = idBuilding;
    }

    public void setIdMember(int idMember) {
        this.idMember = idMember;
    }

    public int getIdMember() {
        return idMember;
    }

    public int getIdBuilding() {
        return idBuilding;
    }

    public int getId() {
        return id;
    }
}
