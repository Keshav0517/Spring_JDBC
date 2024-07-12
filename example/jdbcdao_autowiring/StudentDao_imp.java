package org.example.jdbcdao_autowiring;

import org.example.jdbcdao_autowiring.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component("studentDao")
public class StudentDao_imp implements StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Student getStudent(int studentId) {
        String query="Select * from student_info";
        RowMapper<Student> rowMapper=new RowMapper_imp();
        Student student=this.jdbcTemplate.queryForObject(query,rowMapper,studentId);
        return student;
    }

}
