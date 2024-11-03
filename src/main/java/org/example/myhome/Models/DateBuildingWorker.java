package org.example.myhome.Models;

import jakarta.persistence.*;

import java.sql.Time;
import java.util.Date;
import java.util.List;


@Entity
public class DateBuildingWorker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToMany
    @JoinColumn(name = "person_id", nullable = false)
    private List<Person> people;
    @ManyToMany
    @JoinColumn(name = "building_id", nullable = false)
    private List<Bilding> Buildings;
    private Date date;
    private Time startTime;
    private Time endTime;
    private boolean shabatOrHoliday;

    public boolean isShabatOrHoliday() {
        return shabatOrHoliday;
    }

    public void setShabatOrHoliday(boolean shabatOrHoliday) {
        this.shabatOrHoliday = shabatOrHoliday;
    }


    public void setIdPeople(List<Person> people) {
        this.people = people;
    }

    public void setBuildings(List<Bilding> Buildings) {
        this.Buildings = Buildings;
    }

    public List<Bilding> getBuildings() {
        return Buildings;
    }

    public List<Person> getIdPeople() {
        return people;
    }

    public DateBuildingWorker() {
    }



    public void setId(int id) {
        this.id = id;
    }

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
