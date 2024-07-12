package org.example.jdbcdao_without_xml;

import org.example.jdbcdao_without_xml.entities.Student;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDao_imp implements StudentDao{

    private JdbcTemplate jdbcTemplate;
    @Override
    public int insert(Student student) {
        String query="insert into student_info(id,name,address) values(?,?,?)";
        int r=this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getAddress());
        return r;
    }


    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
}
