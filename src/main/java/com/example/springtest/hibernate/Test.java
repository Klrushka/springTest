package com.example.springtest.hibernate;

import com.example.springtest.hibernate.models.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        Employee employee = new Employee("aboba2", "abobovich2", "res2", 14);

        try{
            session.beginTransaction();
            session.save(employee);

            session.getTransaction().commit();
        } finally {
            factory.close();
        }



    }
}
