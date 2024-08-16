package com.example.Spring_Profile_Eg.service;

import com.example.Spring_Profile_Eg.dao.UserRepository;
import com.example.Spring_Profile_Eg.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile(value ={"spring_local","spring_dev","spring_prod"})
public class UserService {
    @Autowired
    private UserRepository repository;

    public  void addUser(User user) {
        repository.save(user);
    }

    public List<User> getUser(){
        return repository.findAll();
    }

}
