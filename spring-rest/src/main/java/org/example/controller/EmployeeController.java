package org.example.controller;

import org.example.entity.Employee;
import org.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @ResponseBody put the response directly into the body (to JSON using Jackson). Put it directly on
 * class rather than on all the functions.
 * @RequestMapping(value = "/employees") removes the need to write /employees in every method's
 * request mapping.
 * There is no need for /, Spring will automatically put that for you in every mapping.
 * @RestController = @Controller + @ResponseBody
 */
@RestController
@RequestMapping(value = "employees")
public class EmployeeController {

  @Autowired
  private EmployeeService employeeService;

  @RequestMapping(method = RequestMethod.GET)
  public List<Employee> findAll() {
    return employeeService.findAll();
  }

  @RequestMapping(method = RequestMethod.GET, value = "{id}")
  public Employee findOne(@PathVariable("id") String employeeId) {
    return employeeService.findOneById(employeeId);
  }

  @RequestMapping(method = RequestMethod.POST)
  public Employee create(@RequestBody Employee employee) {
    return employee;
  }

  /**
   * PUT: replace an existing resource
   * Request: PUT /api/employees/1001
   * RequestBody: {"id": 1001, "name": "Vipul Sharma", "email": "vipulsharma018@gmail.com",
   *               "password": "asdfdf"}
   */
  @RequestMapping(method = RequestMethod.PUT, value = "{id}")
  public Employee update(@PathVariable("id") String employeeId,@RequestBody Employee employee) {
    return employee;
  }

  @RequestMapping(method = RequestMethod.DELETE, value = "{id}")
  public void delete(@PathVariable("id") String employeeId) {

  }
}
