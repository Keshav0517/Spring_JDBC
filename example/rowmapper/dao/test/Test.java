package org.example.rowmapper.dao.test;

import org.example.rowmapper.dao.StudentDao;
import org.example.rowmapper.dao.entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("rowmapperdao config.xml");
        StudentDao studentDao=context.getBean("studentDao",StudentDao.class);

//        Student student=new Student();
        //Insert data into table
//        student.setId(101);
//        student.setName("Rohan");
//        student.setAddress("DharaShiv");


//        student.setId(102);
//        student.setName("Rahul");
//        student.setAddress("Pune");

//
//        student.setId(103);
//        student.setName("Jayesh");
//        student.setAddress("Indore");


//        int result=studentDao.insert(student);
//        System.out.println("Data inserted"+result);

        Student student=studentDao.getStudent(102);
        System.out.println(student);

        //Multiple students
        List<Student> student1=studentDao.getAllStudent();
        for (Student s:student1){
            System.out.println(s);
        }

    }
}
