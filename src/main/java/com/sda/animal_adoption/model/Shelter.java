package com.sda.animal_adoption.model;

import javax.persistence.*;
import java.util.List;
@Entity
//@Table(name = "shelter")
public class Shelter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String address;

//    @OneToMany(mappedBy = "shelter")
//    private List<User> users;
//
//    @OneToMany(mappedBy = "shelter")
//    private List<Animal> animals;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

//    public List<User> getUsers() {
//        return users;
//    }
//
//    public void setUsers(List<User> users) {
//        this.users = users;
//    }
//
//    public List<Animal> getAnimals() {
//        return animals;
//    }
//
//    public void setAnimals(List<Animal> animals) {
//        this.animals = animals;
//    }
}
