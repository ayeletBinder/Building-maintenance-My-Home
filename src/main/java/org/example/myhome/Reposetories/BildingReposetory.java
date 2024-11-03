package org.example.myhome.Reposetories;

import org.example.myhome.Models.Bilding;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BildingReposetory extends JpaRepository<Bilding,Integer> {
//    getAll
    default Optional<List<Bilding>> GetAllBildings(){
        return Optional.of(this.findAll());
    }

//    getById
    default  Optional<Bilding> GetBildingById(int id){
        return this.findById(id);    }
//    add
    default Bilding AddBilding(Bilding Bilding){
//        return
        return  this.save(Bilding);
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


