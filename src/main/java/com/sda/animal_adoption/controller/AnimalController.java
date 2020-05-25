package com.sda.animal_adoption.controller;

//import com.sda.animal_adoption.service.AnimalService;

import com.sda.animal_adoption.dao.AnimalDao;
import com.sda.animal_adoption.model.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnimalController {

    AnimalDao animalDao;

    @Autowired
    public AnimalController(AnimalDao animalDao) {
        this.animalDao = animalDao;
    }

    @CrossOrigin("*")
    @GetMapping("/showAllAnimals")
    public List<Animal> animals() {
        return (List<Animal>) animalDao.findAll();
    }


}



//    public String sayHi(@PathVariable String hi){
//        return "prefix_" + hi;
//    }
//    private AnimalService animalService;

//    @Autowired
//    public AnimalController(AnimalService animalService) {
//        this.animalService = animalService;
//    }

//    @GetMapping("/sayHi/{hi}")
//    @ResponseBody


