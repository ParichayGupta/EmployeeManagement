package com.employee.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Location {

	@Id
	private int locationId;

	private String location;

//	@ManyToMany
//	@JoinTable(name = "Organization_Location", joinColumns = @JoinColumn(name = "location_id"), inverseJoinColumns = @JoinColumn(name = "organization_id"))
//	private List<Organization> organizationLocation = new ArrayList<>();

//	public void addOrganizationToLocation(Organization organization) {
//		organizationLocation.add(organization);
//	}

}
