package org.example;

import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.security.auth.login.Configuration;

//in this program Cache is used when the sessions try to access the same object using just a query , there is single level cache
//and 2nd level cache, 2nd level is loaded by Ehcache ( download from maven), which is used in the 2nd level cache.
//1st level cache is provided by the hibernate itself
//in the 1st level cache, when 2 variable try to access the same object , single query is enough (this is 1st level)
//in yhe 2nd level ,when 2 session try to access the same object ,(single queries is used)
public class App 
{
    public static void main( String[] args )
    {

        Employee employee = new Employee();
        employee.setName("John Doe");
        employee.setPnum("1234567890");
        employee.setAddress("123 Main St");
        employee.setEmail("john.doe@example.com");

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(employee);
            Employee employe = (Employee) session.get(Employee.class, 110);
            transaction.commit();

            System.out.println(employe);
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

        HibernateUtil.shutdown();
    }
}
