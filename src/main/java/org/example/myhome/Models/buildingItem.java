package org.example.myhome.Models;
@Entity
public class buildingItem {
@id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
    private int idBuilding;
    private int idItem;
}
