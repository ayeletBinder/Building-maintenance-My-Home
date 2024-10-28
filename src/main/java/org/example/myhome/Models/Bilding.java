package org.example.myhome.Models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Bilding {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private String addres;
    private String city;
    @ManyToMany(mappedBy = "bildings")
    private List<Item> items;
    @OneToOne(mappedBy = "bilding")
    private Person person;


}