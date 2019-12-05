package org.example.repository;

import org.example.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRespositoryImpl implements EmployeeRepository {
  @Override
  public List<Employee> findAll() {
    List<Employee> employees = new ArrayList<>();
    employees.add(new Employee("Vipul Sharma", "vipulsharma018@gmail.com", 1000));
    employees.add(new Employee("John Doe", "johndoe@gmail.com", 2000));
    return employees;
  }

  @Override
  public Employee findOne(String id) {
//    return new Employee("Vipul Sharma", "vipulsharma@gmail.com", 1000);
    return null;
  }

}
