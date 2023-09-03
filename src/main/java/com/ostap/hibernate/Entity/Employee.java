package com.ostap.hibernate.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "employees")
@Getter
@Setter
public class Employee {
    @Id
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private String surname;
    
    @Column
    private String department;
    
    @Column
    private int salary;
    
    public Employee(){

    }

    public Employee(String name, String surname, String department, int salary) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", surname=" + surname + ", department=" + department
                + ", salary=" + salary + "]";
    }

    
    
    
}
