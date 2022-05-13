package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Location;
import com.employee.service.LocationService;

@RestController
public class LocationContoller {
	
	@Autowired
	private LocationService locationService;
	
//	add a new location
	@PostMapping(value = "location/add")
	public Location addLocation(@RequestBody Location location) {
		locationService.addLocation(location);
		return location;
		
	}
//	Get all locations
	@GetMapping(value = "/location/all")
	public List<Location> getAllLocations(){
		return locationService.getAllLocations();
	}
	
}
