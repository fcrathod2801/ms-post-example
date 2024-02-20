package com.hibernate.example.controller;

import com.hibernate.example.entity.Department;
import com.hibernate.example.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DepartmentController {
    @Autowired
    DepartmentServiceImpl departmentServiceIml;

    @PostMapping("/departments")
    Department saveDepartmentDetails(@RequestBody Department department) {
        System.out.println("Controller class");
        return departmentServiceIml.saveDepartmentDetails(department);
    }

    @GetMapping("/departments")
    List<Department> listOfDepartmentDetails() {
        return departmentServiceIml.listOfDepartmentDetails();
    }

    @GetMapping("/departments/{departmentCode}")
    Optional<Department> findDepartmentByCode(@PathVariable long departmentCode) {
        System.out.println(departmentCode);
        return departmentServiceIml.findDepartmentByCode(departmentCode);
    }
}


