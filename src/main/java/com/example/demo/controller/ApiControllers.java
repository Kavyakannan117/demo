package com.example.demo.controller;

import com.example.demo.models.User;
import com.example.demo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiControllers {
    @Autowired
    private UserRepo userRepo;
    @GetMapping(value = "/users")
    public List<User> getUser(){
        return userRepo.findAll();
    }
    @PostMapping(value = "/save")
    public String saveUser(User user){
        userRepo.save(user);
        return "saved...";
    }
}