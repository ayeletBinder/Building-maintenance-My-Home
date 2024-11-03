package org.example.myhome.Controllers;


import org.example.myhome.Models.DateBuildingWorker;
import org.example.myhome.Services.DateBuildingWorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/DateBuildingWorker")
public class DateBuildingWorkerController {

    private final DateBuildingWorkerService DateBuildingWorkerService;

    @Autowired
    public DateBuildingWorkerController(DateBuildingWorkerService DateBuildingWorkerService) {
        this.DateBuildingWorkerService = DateBuildingWorkerService;
    }
    @GetMapping
    public Optional<List<DateBuildingWorker>> getAllDateBuildingWorkers() {
        return DateBuildingWorkerService.getAllDateBuildingWorkers();
    }
    @GetMapping("/{id}")
    public ResponseEntity<DateBuildingWorker> getDateBuildingWorkerById(@PathVariable int id) {
        return DateBuildingWorkerService.getDateBuildingWorkerById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping
    public DateBuildingWorker addDateBuildingWorker(@RequestBody DateBuildingWorker DateBuildingWorker) {
        return DateBuildingWorkerService.addBuilding(DateBuildingWorker);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDateBuildingWorker(@PathVariable int id) {
        DateBuildingWorkerService.deleteDateBuildingWorker(id);
        return ResponseEntity.noContent().build();
    }
    @PutMapping("/{id}")
    public DateBuildingWorker updateDateBuildingWorker(@PathVariable int id, @RequestBody DateBuildingWorker DateBuildingWorker) {
        return DateBuildingWorkerService.updateDateBuildingWorker(id, DateBuildingWorker);
    }
}

//CRUD - create, read, update, delete
//getAll - get
//getById - get
//delete - delete
//add - post
//update - put

//לקוח לשרת
//api/DateBuildingWorkers/ {v} {id}
//id
//אוביקט BODY JSON