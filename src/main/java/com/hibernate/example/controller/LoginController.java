package com.hibernate.example.controller;

import com.hibernate.example.dao.LoginRepositry;
import com.hibernate.example.entity.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {
    @Autowired
    LoginRepositry loginRepositry;

            @PostMapping("/login")
            public String saveData(@RequestBody Login login){
            loginRepositry.save(login);
            return "Saved Data";
            }
}
