package com.example.Spring_Profile_Eg.controller;

import com.example.Spring_Profile_Eg.model.User;
import com.example.Spring_Profile_Eg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/addUser")
    public String add(@RequestBody User user)
    {
      service.addUser(user);
      return "User added";
    }

    @GetMapping("/findAllUsers")
    public List<User> findAllUsers(){
        return service.getUser();
    }

}
