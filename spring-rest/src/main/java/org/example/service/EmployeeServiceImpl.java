package org.example.service;

import org.example.entity.Employee;
import org.example.exception.EmployeeNotFoundException;
import org.example.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
  @Autowired
  EmployeeRepository repository;

  @Override
  public List<Employee> findAll() {
    return repository.findAll();
  }

  @Override
  public Employee findOneById(String id) {
    Employee employee = repository.findOne(id);

    if (employee == null) {
      throw new EmployeeNotFoundException("Employee with id" + id + " NOT FOUND!");
    } else {
      return employee;
    }
  }

  @Override
  public Employee create(Employee employee) {
    return null;
  }

  @Override
  public Employee update(String id, Employee employee) {
    return null;
  }

  @Override
  public void delete(String id) {

  }
}
