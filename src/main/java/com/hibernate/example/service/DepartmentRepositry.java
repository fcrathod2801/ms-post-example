package com.hibernate.example.service;

import com.hibernate.example.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepositry extends JpaRepository<Department,Long> {
 /*   Long findByCode(Long departmentCode);*/
}
