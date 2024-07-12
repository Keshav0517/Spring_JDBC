package org.example.jdbc.dao;

import org.example.jdbc.dao.entities.Employee;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao_Impl implements EmployeeDao{
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insert(Employee employee) {
        String query="insert into employee(id,name,address) values(?,?,?)";
        int r=this.jdbcTemplate.update(query,employee.getId(),employee.getName(),employee.getAddress());
        return r;
    }

    @Override
    public int change(Employee employee) {
        String query="update employee set name=?,address=? where id=?";
        int r=this.jdbcTemplate.update(query,employee.getName(),employee.getAddress(),employee.getId());
        return r ;
    }

    public int delete(int employeeId){
        String query="delete from employee where id=?";
        int r=this.jdbcTemplate.update(query,employeeId);
        return r;
    }
}
