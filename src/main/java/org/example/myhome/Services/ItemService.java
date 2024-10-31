package org.example.myhome.Services;

import org.example.myhome.Models.Item;
import org.example.myhome.Reposetories.Itemreposetory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService  {
    private final Itemreposetory itemRepository;

    @Autowired
    public ItemService(Itemreposetory itemreposetory) {
        this.itemRepository = itemreposetory;
    }
    // פונקציה להוספת פריט חדש
    public void addItem(Item item) {
        itemRepository.AddItem(item);
    }

    // פונקציה לעדכון פריט קיים לפי ID
    public Item updateItem(int id, Item ItemDetails) {
        return itemRepository.UpdateItem(id, ItemDetails);
    }
    public Boolean deleteItem(int id) {
        return itemRepository.DeleteItem(id) ;
    }
    public Item getItemById(int id) {
        return itemRepository.GetItemById(id);
    }
    public List<Item> getAllItems() {
        return  itemRepository.GetAllItems();
    }

}
