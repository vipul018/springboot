package org.example.repository;

import org.example.entity.Employee;

import java.util.List;

public interface EmployeeRepository {

  List<Employee> findAll();

  Employee findOne(String id);
}
