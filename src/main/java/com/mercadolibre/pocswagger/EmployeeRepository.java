package com.mercadolibre.pocswagger;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeRepository {

    public List<Employee> findAll(){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("test","test"));
        employees.add(new Employee("test2","test2"));
        return employees;
    }

    public Employee save(Employee newEmployee) {
        return newEmployee;
    }

    public Employee findById(Long id) {
        return new Employee("testById","testById");
    }
}
