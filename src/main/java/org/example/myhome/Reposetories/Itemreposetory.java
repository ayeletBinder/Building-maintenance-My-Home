package org.example.myhome.Reposetories;

import org.example.myhome.Models.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.stream.Collectors;

public interface Itemreposetory extends JpaRepository<Item, Integer> {
    //    getAll
    default List<Item> GetAllItems() {
        return this.findAll();
    }

    //    getById
    default Item GetItemById(int id) {
        System.out.println(this.findAll().stream().filter(x -> x.getId() == id).collect(Collectors.toList()).get(0));
        return this.findById(id).orElse(null);
    }

    //    add
    default void AddItem(Item item) {
        this.save(item);
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


