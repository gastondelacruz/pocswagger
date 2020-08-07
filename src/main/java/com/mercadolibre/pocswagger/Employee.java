package com.mercadolibre.pocswagger;

import java.util.Objects;

class Employee {

    private String name;
    private String role;

    Employee() {}

    Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }


    public String getName() {
        return this.name;
    }

    public String getRole() {
        return this.role;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }


    @Override
    public String toString() {
        return "Employee{" + ", name='" + this.name + '\'' + ", role='" + this.role + '\'' + '}';
    }
}
