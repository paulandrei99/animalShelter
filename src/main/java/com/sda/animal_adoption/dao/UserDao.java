package com.sda.animal_adoption.dao;

import com.sda.animal_adoption.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends CrudRepository<User, Long> {
//    List<User> findAll();


}
