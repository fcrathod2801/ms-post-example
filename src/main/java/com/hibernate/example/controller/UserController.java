package com.hibernate.example.controller;

import com.hibernate.example.entity.User;
import com.hibernate.example.service.UserService;
import com.sun.net.httpserver.Authenticator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/users")
    public ResponseEntity save(@RequestBody User user){
        System.out.println("POst Method");
     userService.save(user);
        return ResponseEntity.ok("Data Successfully added to table");
    }

    @GetMapping("/users")
    List<User> findAll(){
        return userService.findAll();
    }
    @GetMapping("/user/{userId}")
    User getUserId(@PathVariable long userId){
        return  userService.findById(userId);
    }
}
