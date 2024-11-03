package org.example.myhome.Reposetories;

import org.example.myhome.Models.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface Itemreposetory extends JpaRepository<Item, Integer> {
    //    getAll
    default Optional<List<Item>> GetAllItems() {
        return Optional.of(this.findAll());
    }

    //    getById
    default Optional<Item> GetItemById(int id) {
        return this.findById(id);
    }

    //    add
    default Item AddItem(Item item) {
       return this.save(item);
//        return
    }

    //    update
    default Item UpdateItem(int id, Item newItem) {
        return this.findById(id)
                .map(existingItem -> {
                    existingItem.setName(newItem.getName());
                    existingItem.setPrice(newItem.getPrice());
                    return this.save(existingItem);
                })
                .orElse(null); // אם לא נמצא אובייקט מתאים, מחזיר null
    }

    //    delete
    default boolean DeleteItem(int idItem) {
        if (this.existsById(idItem)) {
            this.deleteById(idItem);
            return true;
        }
        return false;
    }
}


