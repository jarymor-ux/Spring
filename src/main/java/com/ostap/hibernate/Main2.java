package com.ostap.hibernate;


import com.ostap.hibernate.Entity.Employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try{
        Session session = factory.getCurrentSession();
        Employee employee = new Employee("Eva", "Karg", "HR", 1800);  
        session.beginTransaction();
        session.save(employee);
        // session.getTransaction().commit();

        int myId = employee.getId();
        // session = factory.getCurrentSession();
        // session.beginTransaction();
        Employee employee2 = session.get(Employee.class, myId);
        session.getTransaction().commit();
        System.out.println(employee2);
        
        System.out.println("Done");
        session.close();
        }finally{
            factory.close();
        }
    }
}
