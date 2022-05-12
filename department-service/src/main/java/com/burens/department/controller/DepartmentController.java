package com.burens.department.controller;

import com.burens.department.entity.Department;
import com.burens.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public  Department saveDepartment(Department department){
        log.info("Inside savDepartment method of department controller");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/alldepartments")
    public List<Department> findDepartments(){
        log.info("Find department by id-controller method");
        return  departmentService.findDepartments();
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long Id){
        log.info("Find department by id-controller method");
        return  departmentService.findDepartmentById(Id);
    }
}
