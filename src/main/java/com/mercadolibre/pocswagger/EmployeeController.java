package com.mercadolibre.pocswagger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository repository;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    @PostMapping("/employee")
    public Employee newEmployee(@RequestBody Employee newEmployee) {
        return repository.save(newEmployee);
    }

    @GetMapping("/employee/{id}")
    public Employee oneEmployee(@PathVariable Long id) {
        return repository.findById(id);
    }

}