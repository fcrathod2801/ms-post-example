package com.hibernate.example.service;


import com.hibernate.example.entity.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {

    Department saveDepartmentDetails(Department department);

    List<Department> listOfDepartmentDetails();

    Optional<Department> findDepartmentByCode(Long departmentCode);

//    Department findByCode(Long departmentCode);
 //   String findByCode(Long departmentId);

}
