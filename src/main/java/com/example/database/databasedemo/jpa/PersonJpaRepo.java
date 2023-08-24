package com.example.database.databasedemo.jpa;

import com.example.database.databasedemo.entity.Person;
import com.example.database.databasedemo.jdbc.personJdbcDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface PersonJpaRepo extends CrudRepository<Person,Integer> {
    /*
@PersistenceContext
    EntityManager entityManager;
    public Person findById(int id){
        return entityManager.find(Person.class,id);
    }
    public Person update(Person person){
        return entityManager.merge(person);
    }
    public Person insert(Person person){
        return entityManager.merge(person);
    }


     */
}
