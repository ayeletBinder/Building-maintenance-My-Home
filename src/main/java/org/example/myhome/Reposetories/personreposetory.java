package org.example.myhome.Reposetories;

import org.example.myhome.Models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface personreposetory extends JpaRepository<Person, Integer> {
    //    getAll
    default Optional <List<Person>> GetAllPersons() {
        return Optional.of(this.findAll()) ;
    }


    //    getById
    default Optional<Person> GetPersonById(int id) {
        return this.findById(id);
    }

    //    add
    default Person AddPerson(Person Person) {
        return this.save(Person);
    }

    //    update
    default Person UpdatePerson(int id, Person newPerson) {
        return this.findById(id)
                .map(existingItem -> {
                    existingItem.setName(newPerson.getName());
                    existingItem.setCity(newPerson.getCity());
                    existingItem.setAddress(newPerson.getAddress());
                    existingItem.setEmail(newPerson.getEmail());
                    existingItem.setPhone(newPerson.getPhone());
                    existingItem.setMember(newPerson.getMember());
                    existingItem.setIdentity(newPerson.getIdentity());


                    return this.save(existingItem);
                })
                .orElse(null); // אם לא נמצא אובייקט מתאים, מחזיר null
    }

    //    delete
    default boolean DeletePerson(int idPerson) {
        if (this.existsById(idPerson)) {
            this.deleteById(idPerson);
            return true;
        }
        return false;
    }
}


