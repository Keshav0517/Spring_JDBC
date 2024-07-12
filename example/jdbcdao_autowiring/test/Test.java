package org.example.jdbcdao_autowiring.test;

import org.example.jdbcdao_autowiring.StudentDao;
import org.example.jdbcdao_autowiring.entities.Student;
import org.example.jdbcdao_autowiring.jdbcdao_config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(jdbcdao_config.class);
        StudentDao studentDao=context.getBean("studentDao",StudentDao.class);

        Student student=studentDao.getStudent(102);
        System.out.println(student);
    }
}
