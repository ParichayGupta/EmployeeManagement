package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Organization;
import com.employee.service.OrganizationService;

@RestController
public class OrganizationController {

	@Autowired
	private OrganizationService organizationService;
	
	@PostMapping(value = "/addOrg")
	public String addOrganization(@RequestBody Organization organization) {
		organizationService.addOrganization(organization);
		return "Org added";
		
	}
}
