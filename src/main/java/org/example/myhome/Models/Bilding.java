package org.example.myhome.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity


public class Bilding {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private String address;
    private String city;
    @ManyToMany(mappedBy = "bildings")
    private List<Item> items;
    @OneToOne(mappedBy = "bilding")
    private Person person;
    
    public Bilding() {
    }
    public Bilding(String address, String city) {
        this.address = address;
        this.city=city;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {return address;}

    public String getCity() {
        return city;
    }
}
