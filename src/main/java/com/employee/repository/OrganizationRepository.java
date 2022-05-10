package com.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.model.Organization;

public interface OrganizationRepository extends JpaRepository<Organization, Integer>{

}
