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
    
    public Person() {}

    public Person( String name, String city, String address, String phone, String email, String member, String identity) {
        this.name = name;
        this.city = city;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.member = member;
        this.identity = identity;
    }

    //get
    public int getId() {return id;}
    public String getName() {return name;}
    public String getCity() {return city;}
    public String getAddress() {return address;}
    public String getPhone() {return phone;}
    public String getEmail() {return email;}
    public String getMember() {return member;}
    public String getIdentity() {return identity;}

    //set
    public void setName(String name) {this.name = name;}
    public void setCity(String city) {this.city = city;}
    public void setAddress(String address) {this.address = address;}
    public void setPhone(String phone) {this.phone = phone;}
    public void setEmail(String email) {this.email = email;}
    public void setMember(String member) {this.member = member;}
    public void setIdentity(String identity) {this.identity = identity;}

}
