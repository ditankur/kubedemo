package com.example.kubedemo.frontend;

import com.example.kubedemo.backend.Employee;
import com.example.kubedemo.backend.EmployeeRepository;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @Resource
    private EmployeeRepository employeeRepository;


    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        final List<Employee> allEmployees = new ArrayList<>();
        employeeRepository.findAll().forEach(allEmployees::add);
        return allEmployees;
    }

    @GetMapping("/employees/{empId}")
    public Employee getEmployeeById(@PathVariable final Integer empId) {
       return employeeRepository.findById(empId);
    }
}
