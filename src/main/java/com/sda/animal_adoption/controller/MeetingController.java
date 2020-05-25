package com.sda.animal_adoption.controller;

import com.sda.animal_adoption.dao.AnimalDao;
import com.sda.animal_adoption.dao.MeetingDao;
import com.sda.animal_adoption.dao.UserDao;
import com.sda.animal_adoption.model.Meeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

@RestController
public class MeetingController {

    @Autowired
    MeetingDao meetingDao;

    @Autowired
    UserDao userDao;

    @Autowired
    AnimalDao animalDao;

    @CrossOrigin("*")
    @PostMapping("/createMeeting")
    public void createMeeting(@RequestParam(name = "idUser") Long idUser,
                              @RequestParam(name = "idAnimal") Long idAnimal){
        Meeting meeting = new Meeting();
        meeting.setDetails("test");
        meeting.setDate(new java.sql.Date(Calendar.getInstance().getTime().getTime()));
        meeting.setUser(userDao.findById(idUser).orElseThrow(()-> new NullPointerException("user not found")));
        meeting.setAnimal(animalDao.findById(idAnimal).get());
        meetingDao.save(meeting);

    }

}
