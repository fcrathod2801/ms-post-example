package com.hibernate.example.dao;

import com.hibernate.example.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepositry extends JpaRepository<Login,Long> {
}
