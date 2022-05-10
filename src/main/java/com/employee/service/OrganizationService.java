package com.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.model.Organization;
import com.employee.repository.OrganizationRepository;

@Service
public class OrganizationService {
	
	@Autowired
	private OrganizationRepository organizationRepository;

	public void addOrganization(Organization organization) {
		// TODO Auto-generated method stub
		organizationRepository.save(organization);
		
	}

}
