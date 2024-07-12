package org.example.rowmapper.dao;


import org.example.rowmapper.dao.entities.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapper_Imp implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet resultSet, int i) throws SQLException {
        //Create Student class object
        Student student=new Student();
        student.setId(resultSet.getInt(1));
        student.setName(resultSet.getString(2));
        student.setAddress(resultSet.getString(3));
        return student;
    }

}
