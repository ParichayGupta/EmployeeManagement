package com.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.model.Organization;
import java.lang.String;
import java.util.List;
import java.util.Optional;

public interface OrganizationRepository extends JpaRepository<Organization, Integer>{

	Optional<Organization> findByOrganization(String organization);
}
