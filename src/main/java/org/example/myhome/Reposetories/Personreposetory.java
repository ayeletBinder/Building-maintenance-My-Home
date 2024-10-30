package org.example.myhome.Reposetories;

import org.example.myhome.Models.Person;
import org.example.myhome.Models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.stream.Collectors;

public interface Personreposetory extends JpaRepository<Person,Integer> {
//    getAll
    default List<Person> GetAllPersons(){
        return  this.findAll();
    }
//    getById
    default  Person GetPersonById(int id){
        System.out.println( this.findAll().stream().filter(x->x.getId()==id).collect(Collectors.toList()).get(0) );
        return this.findById(id).orElse(null);    }
//    add
    default void AddPerson(Person Person){
        this.save(Person);
//        return
    }
//    update
default Person UpdatePerson(int id,Person newPerson){
        return this.findById(id)
                .map(existingItem -> {
                    existingItem.setAddress(newPerson.getAddress());
                    existingItem.setCity(newPerson.getCity());
                    existingItem.setEmail(newPerson.getEmail());
                    existingItem.setName(newPerson.getName());
                    existingItem.setPhone(newPerson.getPhone());
                    existingItem.setIdentity(newPerson.getIdentity());
                    existingItem.setMember(newPerson.getMember());
                    return this.save(existingItem);
                })
                .orElse(null); // אם לא נמצא אובייקט מתאים, מחזיר null
    }

    //    delete
    default boolean DeletePerson(int idPerson){
        if (this.existsById(idPerson)) {
            this.deleteById(idPerson);
            return true;
        }
        return false;
    }
}


