package org.example.rowmapper.dao;

import org.example.rowmapper.dao.entities.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class StudentDao_imp implements StudentDao {
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insert(Student student){
        String query="insert into student_info(id,name,address) values(?,?,?)";
        int r=this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getAddress());
        return r;
    }

    @Override
    public Student getStudent(int studentId) {
        String query="Select * from student_info where id=?";
        RowMapper<Student> rowMapperImp=new RowMapper_Imp();
        Student student=this.jdbcTemplate.queryForObject(query,rowMapperImp,studentId);
        return student;
    }

    public List<Student> getAllStudent(){
        String query="Select * from student_info";
        RowMapper<Student> rowMapper=new RowMapper_Imp();
        List<Student> students=this.jdbcTemplate.query(query,rowMapper);
        return students ;
    }
}
