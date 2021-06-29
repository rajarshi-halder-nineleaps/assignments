package com.example.employee.employees.controller;

import com.example.employee.employees.dto.EmployeeDto;
import com.example.employee.employees.entity.Employee;
import com.example.employee.employees.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @GetMapping("/employees")
    public List<Employee> getallEmployees(){
        return service.getEmployees();
    }

    @GetMapping("/all/{empId}")
    public Employee getEmployee(
            @PathVariable Integer empId
    ){
        return service.getEmployee(empId);

    }

    @PostMapping("/new")
    public EmployeeDto createNewEmployee(@RequestBody EmployeeDto employee){
        return service.createNew(employee);
    }

}
