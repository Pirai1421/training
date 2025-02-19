package org.example;

import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("1. Create Employee\n2. Delete Employee\n3. View Employees\n4. Update Employee\n5. Exit");
            choice = s.nextInt();
            s.nextLine();
            switch (choice) {
                case 1:
                    createEmp(s);
                    break;
                case 2:
                    deleteEmp(s);
                    break;
                case 3:
                    try {
                        viewEmp(s);
                        break;
                    }
                    catch(Exception e){
                        System.out.println(e);

                }
                case 4:
                    updateEmp(s);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    HibernateUtil.shutdown();
                    return;
                default:
                    System.out.println("Enter a valid number");
            }
        }
    }

    private static void viewEmp(Scanner s) throws Exception{
        Session newSession = HibernateUtil.getSessionFactory().openSession();
        try {

            List<Employee> employees = newSession.createQuery("FROM Employee", Employee.class).list();
            for (Employee employee : employees) {
                System.out.println(employee);
            }
            System.out.println("enter the employee id to view");
            int tempId=s.nextInt();
            Query<Employee> query = newSession.createQuery("FROM Employee WHERE eid = :id", Employee.class);
            query.setParameter("id",tempId );
            Employee employee = query.uniqueResult();
            System.out.println(employee);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            newSession.close();
        }
    }

    private static void deleteEmp(Scanner s) {
        System.out.print("Enter Employee ID to delete: ");
        int id = s.nextInt();
        s.nextLine();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            Employee employee = session.get(Employee.class, id);
            if (employee != null) {
                session.delete(employee);
                transaction.commit();
                System.out.println("Employee deleted successfully.");
            } else {
                System.out.println("Employee not found.");
            }
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    private static void createEmp(Scanner s) {
        System.out.print("Enter Name: ");
        String name = s.nextLine();
        System.out.print("Enter Phone Number: ");
        String pnum = s.nextLine();
        System.out.print("Enter Address: ");
        String address = s.nextLine();
        System.out.print("Enter Email: ");
        String email = s.nextLine();

        Employee employee = new Employee();
        employee.setName(name);
        employee.setPnum(pnum);
        employee.setAddress(address);
        employee.setEmail(email);

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(employee);
            transaction.commit();
            System.out.println("Employee created successfully.");
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    private static void updateEmp(Scanner s) {
        System.out.print("Enter Employee ID to update: ");
        int id = s.nextInt();
        s.nextLine();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = null;
        try {

            transaction = session.beginTransaction();
            Employee employee = session.get(Employee.class, id);
            if (employee != null) {
                System.out.print("Enter new Name: ");
                String name = s.nextLine();
                System.out.print("Enter new Phone Number: ");
                String pnum = s.nextLine();
                System.out.print("Enter new Address: ");
                String address = s.nextLine();
                System.out.print("Enter new Email: ");
                String email = s.nextLine();

                employee.setName(name);
                employee.setPnum(pnum);
                employee.setAddress(address);
                employee.setEmail(email);
                session.update(employee);
                transaction.commit();
                System.out.println("Employee updated successfully.");
            } else {
                System.out.println("Employee not found.");
            }
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}