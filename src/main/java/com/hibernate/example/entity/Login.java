package com.hibernate.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Login")
public class Login {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int srno;
    private String username;
    private String password;

}
