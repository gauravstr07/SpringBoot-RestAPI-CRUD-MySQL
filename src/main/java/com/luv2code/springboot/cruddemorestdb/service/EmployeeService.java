package com.luv2code.springboot.cruddemorestdb.service;

import java.util.List;

import com.luv2code.springboot.cruddemorestdb.entity.Employee;

public interface EmployeeService {

	List<Employee> findAll();

	Employee findById(int theId);

	Employee save(Employee theEmployee);

	void deleteById(int theId);

}
