package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/{hello}")
	public String hello(@PathVariable String hello) {
		return hello;
	}
	
//	Post mapping to insert into db 
//	Proudces json type
	@PostMapping(value = "/add",produces = MediaType.APPLICATION_JSON_VALUE )
	public String addEmployee(@RequestBody Employee employee) {
		employeeRepository.save(employee);
		return "user Added";
	}
}
