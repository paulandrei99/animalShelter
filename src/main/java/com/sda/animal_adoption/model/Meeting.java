package com.sda.animal_adoption.model;

import javax.persistence.*;
import java.util.Date;
@Entity
//@Table(name = "meeting")
public class Meeting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Date date;

    @Column
    private String details;

    @OneToOne
    @JoinColumn(name = "id_user",referencedColumnName = "id")
    private User user;

    @OneToOne
    @JoinColumn(name = "id_animal",referencedColumnName = "id")
    private Animal animal;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
