package org.example.myhome.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Time;
import java.util.Date;


@Entity
public class DateBuildingWorker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int idWorker;
    private int idBuilding;
    private Date date;
    private Time startTime;
    private Time endTime;

    public DateBuildingWorker() {}

    public DateBuildingWorker(int id) {
        this.id = id;
    }

    //set
    public void setDate(Date date) {
        this.date = date;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    //get

    public int getId() {
        return id;
    }

    public int getIdWorker() {
        return idWorker;
    }

    public int getIdBuilding() {
        return idBuilding;
    }

    public Date getDate() {
        return date;
    }

    public Time getStartTime() {
        return startTime;
    }

    public Time getEndTime() {
        return endTime;
    }
}