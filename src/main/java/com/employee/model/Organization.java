package com.employee.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.core.sym.Name;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Organization {
	
	@Id
	@Column(name = "organizationId")
	private int organizationId;
	
	@Column(name = "organization")
	private String organization;
	
	@OneToMany(targetEntity = Location.class)
	@JoinColumn(name = "OrgId",referencedColumnName = "organizationId")
	private List<Location> locations;

	@OneToMany(targetEntity = Employee.class)
	@JoinColumn(name = "OrgId",referencedColumnName = "organizationId")
	private List<Employee> employees;
}
