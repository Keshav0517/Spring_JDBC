package org.example.jdbc.dao;

import org.example.jdbc.dao.entities.Employee;

public interface EmployeeDao {

    int insert(Employee employee);
    int change(Employee employee);
    int delete(int employeeId);
}
