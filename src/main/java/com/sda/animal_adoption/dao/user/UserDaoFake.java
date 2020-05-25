//package com.sda.animal_adoption.dao.user;
//
//import com.sda.animal_adoption.model.User;
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.List;
//@Repository
//public class UserDaoFake {
//
//    List<User> users = new ArrayList<>();
//
//    {
//        User user = new User();
//        user.setId(8L);
//        user.setName("Paul");
//        users.add(user);
//
//
//    }
//
//    public void saveUser(User user){
//        users.add(user);
//    }
//
//    public void deleteUser(Long id){
//        Integer index = 0;
//        for(int i = 0; i <users.size(); i++){
//            if(users.get(i).getId() != null && users.get(i).getId().equals(id)){
//                index = i;
//            }
//        }
//        users.remove(index);
//    }
//
//    public void updateUser(Long id,User newUser){
//
//    }
//
//    public void updateUserEmail(Long id,String email){
//        for(User user : users){
//            if(user.getId().equals(id)){
//                user.setEmail(email);
//            }
//        }
//    }
//
//    public List<User> findAll(){
//        return this.users;
//    }
//
//    public User getUser(Long id){
//        for(User user : users){
//            if(user.getId().equals(id)){
//                return user;
//            }
//        }
//        throw new NullPointerException("User id not found");
//    }
//
//
//}
