package com.example.springtest.hibernate;

import com.example.springtest.hibernate.models.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {
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

            List<Employee> employees = session.createQuery("from Employee "
            + "where name = 'aboba'").getResultList();

            for (Employee e : employees){
                System.out.println(e);
            }

            session.getTransaction().commit();
        } finally {
            factory.close();
        }

    }
}
