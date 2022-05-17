package com.employee.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

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

//	@ManyToMany(mappedBy = "organizationLocation")
//	private List<Location> locations = new ArrayList<>();
	@OneToMany(targetEntity = Location.class)
	@JoinColumn(name = "OrgId",referencedColumnName = "organizationId")
	private List<Location> locations;

	@OneToMany(targetEntity = Employee.class)
	@JoinColumn(name = "OrgId", referencedColumnName = "organizationId")
	private List<Employee> employees;
}
