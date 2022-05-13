package com.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.model.Employee;
import com.employee.model.Location;
import com.employee.model.Organization;
import com.employee.repository.OrganizationRepository;

@Service
public class OrganizationService {

	@Autowired
	private OrganizationRepository organizationRepository;

	public Organization addOrganization(Organization organization) {
		return organizationRepository.save(organization);
	}

	public List<Employee> getEmployeesByOrganizationId(int organiztionId) {
		Optional<Organization> organization = organizationRepository.findById(organiztionId);
		List<Employee> employees = null;
		if (organization != null) {
			employees = organization.get().getEmployees();
		}
		return employees;
	}

	public List<Employee> getEmployeesByOrganizationName(String organiztionName) {
		Optional<Organization> organization = organizationRepository.findByOrganization(organiztionName);
		List<Employee> employees = null;
		if (organization != null) {
			employees = organization.get().getEmployees();
		}
		return employees;
	}

	public List<Location> getLocationsByOrganizationName(String organizationName) {
		Optional<Organization> organization = organizationRepository.findByOrganization(organizationName);
		List<Location> locations = null;
		if (organization != null) {
			locations = organization.get().getLocations();
		}
		return locations;
	}
}
