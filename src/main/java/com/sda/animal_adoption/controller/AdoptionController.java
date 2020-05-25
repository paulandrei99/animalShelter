package com.sda.animal_adoption.controller;

import com.sda.animal_adoption.dao.AdoptionDao;
import com.sda.animal_adoption.dao.AnimalDao;
import com.sda.animal_adoption.dao.UserDao;
import com.sda.animal_adoption.model.Adoption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

@RestController
public class AdoptionController {

    @Autowired
    AdoptionDao adoptionDao;

    @Autowired
    UserDao userDao;

    @Autowired
    AnimalDao animalDao;


    @CrossOrigin("*")
    @PostMapping("/createAdoption")
    public void createAdoption(@RequestParam(name = "idUser") Long idUser,
                               @RequestParam(name = "idAnimal") Long idAnimal){
        Adoption adoption = new Adoption();
        adoption.setDetails("test");
        adoption.setData(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
        adoption.setUser(userDao.findById(idUser).get());
        adoption.setAnimal(animalDao.findById(idAnimal).get());
        adoptionDao.save(adoption);
    }
}
