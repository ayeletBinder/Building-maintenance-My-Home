package org.example.myhome.Models;

import java.sql.Time;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class dateBuildingWorker {
    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int idWorker;
    private int idBuilding;
    private Date date;
    private Time startTime;
    private Time endTime;
}
