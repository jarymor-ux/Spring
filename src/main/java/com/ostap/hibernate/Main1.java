package com.ostap.hibernate;


import com.ostap.hibernate.Entity.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try{Session session = factory.getCurrentSession();
        Employee employee = new Employee("Ostap", "Evdokimov", "IT", 1500);
        session.beginTransaction();
        session.save(employee);
        session.getTransaction().commit();
        session.close();
        }finally{
            factory.close();
        }
    }
}
