package org.example.myhome.Services;

import org.example.myhome.Models.Person;
import org.example.myhome.Reposetories.Personreposetory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService  {
    @Autowired
    private Personreposetory PersonRepository;

    // פונקציה להוספת פריט חדש
    public void addPerson(Person Person) {
        PersonRepository.AddPerson(Person);
    }

    // פונקציה לעדכון פריט קיים לפי ID
    public Person updatePerson(int id, Person PersonDetails) {
        return PersonRepository.UpdatePerson(id, PersonDetails);
    }
    public Boolean deletePerson(int id) {
        return PersonRepository.DeletePerson(id) ;
    }
    public Person getPersonById(int id) {
        return PersonRepository.GetPersonById(id);
    }
    public List<Person> getAllPersons() {
        return  PersonRepository.GetAllPersons();
    }

}