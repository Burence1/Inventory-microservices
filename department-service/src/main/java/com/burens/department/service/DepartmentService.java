package com.burens.department.service;

import com.burens.department.entity.Department;
import com.burens.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DepartmentService {


    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {

        log.info("Inside savedepartment method of service");
        return  departmentRepository.save(department);
    }


    public Department findDepartmentById(Long id) {
        log.info("Inside getDepartment method of service");
        return departmentRepository.getById(id);
    }

    public List<Department> findDepartments(){
        return departmentRepository.findAll();
    }
}
