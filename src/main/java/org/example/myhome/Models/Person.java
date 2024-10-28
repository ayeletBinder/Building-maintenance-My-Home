package org.example.myhome.Models;

import jakarta.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private String name;
    private String city;
    private String address;
    private String phone;
    private String email;
    private String member;
    private String identity;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "building_id", referencedColumnName = "id")
    private Bilding bilding;
}
