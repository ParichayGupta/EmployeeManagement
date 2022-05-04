package com.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;


@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}
	
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	public Optional<Employee> findEmployeeById(int id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id);
	}

	public Optional<Employee> findEmployeeByName(String name) {
		// TODO Auto-generated method stub
		return employeeRepository.findByName(name);
	}

}
