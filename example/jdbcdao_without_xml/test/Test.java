package org.example.jdbcdao_without_xml.test;

import org.example.jdbcdao_without_xml.StudentDao;
import org.example.jdbcdao_without_xml.entities.Student;
import org.example.jdbcdao_without_xml.jdbcdao_config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(jdbcdao_config.class);
        StudentDao studentDao=context.getBean("studentDao",StudentDao.class);

        Student student=new Student();
        student.setId(104);
        student.setName("Ganesh");
        student.setAddress("Kanpur");

        int result=studentDao.insert(student);
        System.out.println(result);
        System.out.println("Data Inserted");

    }
}
