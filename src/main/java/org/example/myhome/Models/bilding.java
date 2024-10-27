package org.example.myhome.Models;

@Entity


public class bilding {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private  int id;
private String addres;
private String city;
}
