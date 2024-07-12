package org.example.jdbcdao_autowiring;

import org.example.jdbcdao_autowiring.entities.Student;

public interface StudentDao {
    public Student getStudent(int studentId);
}
