package com.employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;
import com.employee.service.EmployeeService;


@RestController
public class EmployeeController {
	

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/{hello}")
	public String hello(@PathVariable String hello) {
		return hello;
	}
	
//	Post mapping to insert into db 
//	Produces json type
	@PostMapping(value = "/add",produces = MediaType.APPLICATION_JSON_VALUE )
	public Employee addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
		return employee;
	}
	
	@GetMapping(value = "/all")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@GetMapping(value = "/employee/{id}")
	public Optional<Employee> getEmployeeById(@PathVariable int id) {
		return employeeService.findEmployeeById(id);	 
	}
	
	@GetMapping(value = "/emp/{name}")
	public Optional<Employee> getEmployeeByName(@PathVariable String name){
		return employeeService.findEmployeeByName(name);
	}
	
////	Put mapping to update an employee in database
//	@PutMapping(value = "/update")
//	public Employee updateEmployee(@RequestBody Employee employee)
//	{
//		employeeService.updateEmployee(employee);
//		return employee;
//	}
}
