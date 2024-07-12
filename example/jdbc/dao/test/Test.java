package org.example.jdbc.dao.test;

import org.example.jdbc.dao.EmployeeDao;
import org.example.jdbc.dao.EmployeeDao_Impl;
import org.example.jdbc.dao.entities.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("jdbcdao config.xml");
        EmployeeDao employeeDao=context.getBean("employeeDao", EmployeeDao.class);


        Employee employee=new Employee();
        //Insert data into table
//        employee.setId(101);
//        employee.setName("Pulkit");
//        employee.setAddress("Pune");
//
//        employee.setId(102);
//        employee.setName("Keshav");
//        employee.setAddress("Indore");

//        employee.setId(103);
//        employee.setName("Jayesh");
//        employee.setAddress("Indore");
//
//        int insert=employeeDao.insert(employee);
//        System.out.println(insert);

        //Update Data into table
//        employee.setId(103);
//        employee.setName("Tejas");
//        employee.setAddress("Nagar");
//        int result=employeeDao.change(employee);
//        System.out.println("Data Changed"+result);

        //Delete data from table
        int result=employeeDao.delete(103);
        System.out.println(result);
        System.out.println("Data Deleted");









    }
}
