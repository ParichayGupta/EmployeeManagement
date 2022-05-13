package com.employee.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

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
	
	@OneToMany(targetEntity = Employee.class)
	@JoinColumn(referencedColumnName = "locationId", name = "locationId")
	private List<Employee> employees;

}
