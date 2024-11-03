package org.example.myhome.Services;

import org.example.myhome.Models.Item;
import org.example.myhome.Reposetories.Itemreposetory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService  {
    private final Itemreposetory itemRepository;

    @Autowired
    public ItemService(Itemreposetory itemreposetory) {
        this.itemRepository = itemreposetory;
    }
    // פונקציה להוספת פריט חדש
    public Item addItem(Item item) {
       return itemRepository.AddItem(item);
    }

    // פונקציה לעדכון פריט קיים לפי ID
    public Item updateItem(int id, Item ItemDetails) {
        return itemRepository.UpdateItem(id, ItemDetails);
    }
    public Boolean deleteItem(int id) {
        return itemRepository.DeleteItem(id) ;
    }
    public Optional<Item> getItemById(int id) {
        return itemRepository.GetItemById(id);
    }
    public Optional<List<Item>> getAllItems() {
        return itemRepository.GetAllItems();
    }

}
