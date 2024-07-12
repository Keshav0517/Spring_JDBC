package org.example.rowmapper.dao;


import org.example.rowmapper.dao.entities.Student;

import java.util.List;

public interface StudentDao {
    public int insert(Student student);

    //Single object
    public Student getStudent(int studentId);

    public List<Student> getAllStudent();

}
