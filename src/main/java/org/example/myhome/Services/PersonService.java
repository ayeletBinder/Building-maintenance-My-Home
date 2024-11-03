package org.example.myhome.Services;

import org.example.myhome.Models.Item;
import org.example.myhome.Models.Person;
import org.example.myhome.Reposetories.personreposetory;
import org.example.myhome.Reposetories.personreposetory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService  {
    @Autowired
    private personreposetory PersonRepository;

    // פונקציה להוספת פריט חדש
    public Person addPerson(Person Person) {
        return PersonRepository.AddPerson(Person);
    }

    // פונקציה לעדכון פריט קיים לפי ID
    public Person updatePerson(int id, Person PersonDetails) {
        return PersonRepository.UpdatePerson(id, PersonDetails);
    }
    public Boolean deletePerson(int id) {
        return PersonRepository.DeletePerson(id) ;
    }


    public Optional <Person> getPersonById(int id) {
        return PersonRepository.GetPersonById(id);
    }

    public Optional <List <Person>> getAllPersons() {
        return  PersonRepository.GetAllPersons();
    }

}
