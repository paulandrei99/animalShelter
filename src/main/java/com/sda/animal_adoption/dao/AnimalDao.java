package com.sda.animal_adoption.dao;

import com.sda.animal_adoption.model.Animal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalDao extends CrudRepository<Animal, Long> {
//    List<Animal> findAll();
}
