package com.example.kubedemo.backend;

import org.springframework.data.repository.CrudRepository;


public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    Employee findById(int id);

}
