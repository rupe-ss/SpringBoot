package com.learning.springboot.dao;

import com.learning.springboot.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("personDao")
public class PersonDataAccessService implements PersonDao{
    private static List<Person> DB = new ArrayList<>();

    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id, person.getName()));
        return 1;
    }

    @Override
    public List<Person> getAllPeople() {
        return DB;
    }

    @Override
    public Optional<Person> getPersonById(UUID id) {
        return DB.stream().filter(person -> person.getUuid().equals(id)).findFirst();
    }

    @Override
    public int deletePersonById(UUID id) {
        Optional<Person> person = getPersonById(id);
        if (getPersonById(id).isEmpty()) {
            return 0;
        }
        DB.remove(person.get());
        return 1;
    }
}
