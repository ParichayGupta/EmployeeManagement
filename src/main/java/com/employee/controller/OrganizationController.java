package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.model.Location;
import com.employee.model.Organization;
import com.employee.service.OrganizationService;

@RestController
public class OrganizationController {

	@Autowired
	private OrganizationService organizationService;

//	Adding organization with employees and locations
	@PostMapping(value = "/addOrg")
	public Organization addOrganization(@RequestBody Organization organization) {
		organizationService.addOrganization(organization);
		return organization;
	}

//	get all employees of organization by id
	@GetMapping(value = "/{organiztionId}/employees/all")
	public List<Employee> getEmployeesByOrganizationId(@PathVariable int organiztionId) {
		return organizationService.getEmployeesByOrganizationId(organiztionId);
	}

//	Get all employees of organization by name
	@GetMapping(value = "/{organizationName}/employee/all")
	public List<Employee> getEmployeeByOrganizationName(@PathVariable String organizationName) {
		return organizationService.getEmployeesByOrganizationName(organizationName);
	}

//	Get all locations of Organization by name
	@GetMapping(value = "/{organizationName}/locations/all")
	public List<Location> getLocationsByOrganizationName(@PathVariable String organizationName) {
		return organizationService.getLocationsByOrganizationName(organizationName);
	}
}
