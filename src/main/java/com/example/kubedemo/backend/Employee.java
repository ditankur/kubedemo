package com.example.kubedemo.backend;

import jakarta.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    private Integer id;

    private String name;

    private String designation;


    protected Employee() {}

    public Employee(Integer id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
    }

    @Override
    public String toString() {
        return String.format("Employee[Id='%d', Name='%s', Designation='%s']",
                id, name, designation);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }
}