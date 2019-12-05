package org.example.service;

import org.example.entity.Employee;

import java.util.List;

public interface EmployeeService {

  List<Employee> findAll();
  Employee findOneById(String id);
  Employee create(Employee employee);
  Employee update(String id, Employee employee);
  void delete(String id);
}
