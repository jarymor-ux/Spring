package com.ostap.hibernate;


import com.ostap.hibernate.Entity.Employee;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main3 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try{
        Session session = factory.getCurrentSession();
        session.beginTransaction();

        // List<Employee> emps = session.createQuery("from Employee", Employee.class)
        // .getResultList();
        List<Employee> emps = session.createQuery("from Employee where name = 'Oleg' and salary > 1000", Employee.class)
        .getResultList();                                                        // name - название переменной в классе Employee, а не название столбца в таблице  
        for (Employee employee : emps) {
            System.out.println(employee);
        }
        

        session.getTransaction().commit();;





        session.close();
        }finally{
            factory.close();
        }
    }
}
