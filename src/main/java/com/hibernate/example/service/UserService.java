package com.hibernate.example.service;

import com.hibernate.example.dao.UserDao;
import com.hibernate.example.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserDao userDao;


    public User save(User user) {
        System.out.println("Data has been save " + user.toString());
        return userDao.save(user);
    }
    public List<User> findAll() {
        return userDao.findAll();
    }

    public User findById(long userId) {
        return userDao.findById(userId).get();
    }
}
