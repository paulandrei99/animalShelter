package com.sda.animal_adoption.controller;

import com.sda.animal_adoption.dao.UserDao;
import com.sda.animal_adoption.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    UserDao userDao;

    @CrossOrigin("*")
    @GetMapping("/showAllUsers")
    public List<User> users(){
        return (List<User>) userDao.findAll();
    }


}



//    @PostMapping("/save")
//    public void saveUser(@RequestBody User user){
//        userService.saveUser(user);
//    }
//
//    @DeleteMapping("delete/{id}")
//    public void deleteUser(@PathVariable Long id){
//        userService.delete(id);
//    }

//    private UserService userService = new UserService();

//    private UserService userService;

//    @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//    @GetMapping("/findAll")
//    public List<User> findAll(){
//        return userService.findAll();
//    }

//    @GetMapping("/showAllUsers")
//    public String showAllUsers() {
//        List<User> usersList = userDao.findAll();
//        return usersList.toString();
//    }
