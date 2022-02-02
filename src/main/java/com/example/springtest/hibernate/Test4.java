package com.example.springtest.hibernate;

import com.example.springtest.hibernate.models.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();


        try {
            session.beginTransaction();

          /*  Employee employee1 = session.get(Employee.class, 2);

            employee1.setName("Kirill");*/

            session.createQuery("update Employee set salary = 111 where name = 'Kirill'").executeUpdate();

            session.getTransaction().commit();
        } finally {
            factory.close();
        }

    }
}
