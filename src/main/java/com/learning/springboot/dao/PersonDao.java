package com.learning.springboot.dao;

import com.learning.springboot.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonDao {

    int insertPerson(UUID uuid, Person person);

    default int insertPerson(Person person){
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> getAllPeople();

    Optional<Person> getPersonById(UUID id);
}
