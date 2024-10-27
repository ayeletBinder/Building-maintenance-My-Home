package org.example.myhome.Models;
@Entity
public class memberBuilding {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private int idBuilding;
    private int idMember;
}
