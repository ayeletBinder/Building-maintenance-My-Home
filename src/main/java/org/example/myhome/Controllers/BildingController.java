package org.example.myhome.Controllers;


import org.example.myhome.Models.Bilding;
import org.example.myhome.Services.BildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Bilding")
public class BildingController {

    private final BildingService BildingService;

    @Autowired
    public BildingController(BildingService BildingService) {
        this.BildingService = BildingService;
    }
    @GetMapping
    public Optional<List<Bilding>> getAllBildings() {
        return BildingService.getAllBildings();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Bilding> getBildingById(@PathVariable int id) {
        return BildingService.getBildingById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping
    public Bilding addBilding(@RequestBody Bilding Bilding) {
        return BildingService.addBuilding(Bilding);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBilding(@PathVariable int id) {
        BildingService.deleteBilding(id);
        return ResponseEntity.noContent().build();
    }
    @PutMapping("/{id}")
    public Bilding updateBilding(@PathVariable int id, @RequestBody Bilding Bilding) {
        return BildingService.updateBilding(id, Bilding);
    }
}

//CRUD - create, read, update, delete
//getAll - get
//getById - get
//delete - delete
//add - post
//update - put

//לקוח לשרת
//api/Bildings/ {v} {id}
//id
//אוביקט BODY JSON