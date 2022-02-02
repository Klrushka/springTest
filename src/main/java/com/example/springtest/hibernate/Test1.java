package com.example.springtest.hibernate;

import com.example.springtest.hibernate.models.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        Employee employee = new Employee("aboba3", "abobovich3", "res3", 17);

        try {
            session.beginTransaction();
            session.save(employee);

            int id = employee.getId();

            Employee employee1 = session.get(Employee.class, id);

            session.getTransaction().commit();

            System.out.println(employee1);

        } finally {
            factory.close();
        }

    }
}
