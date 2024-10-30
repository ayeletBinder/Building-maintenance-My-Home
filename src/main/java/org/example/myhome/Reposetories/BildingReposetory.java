package org.example.myhome.Reposetories;

import org.example.myhome.Models.Bilding;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BildingReposetory extends JpaRepository<Bilding,Integer> {
//    getAll
    default List<Bilding> GetAllBildings(){
        return  this.findAll();
    }

//    getById
    default  Bilding GetBildingById(int id){
        return this.findById(id).orElse(null);    }
//    add
    default Bilding AddBilding(Bilding Bilding){
        this.save(Bilding);
//        return
        return Bilding;
    }
//    update
default Bilding UpdateBilding(int id,Bilding newBilding){
        return this.findById(id)
                .map(existing -> {
                    existing.setAddress(newBilding.getAddress());
                    existing.setCity(newBilding.getCity());
                    return this.save(existing);
                })
                .orElse(null); // אם לא נמצא אובייקט מתאים, מחזיר null
    }

    //    delete
    default boolean DeleteBilding(int idBilding){
        if (this.existsById(idBilding)) {
            this.deleteById(idBilding);
            return true;
        }
        return false;
    }
}


