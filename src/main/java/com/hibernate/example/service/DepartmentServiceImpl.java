package com.hibernate.example.service;

import com.hibernate.example.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    DepartmentRepositry departmentRepositry;


    @Override

    public Department saveDepartmentDetails(@RequestBody Department department) {
        System.out.println("Service IMpl");
        return departmentRepositry.save(department);
    }

    @Override
    public List<Department> listOfDepartmentDetails() {
        return departmentRepositry.findAll();
    }

    @Override
    public Optional<Department> findDepartmentByCode(Long departmentCode) {
        return departmentRepositry.findById(departmentCode);
    }



}
