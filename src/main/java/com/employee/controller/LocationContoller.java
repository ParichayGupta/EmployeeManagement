package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Location;
import com.employee.service.LocationService;

@RestController
public class LocationContoller {
	
	@Autowired
	private LocationService locationService;
	
	@PostMapping(value = "location/add")
	public String addLocation(@RequestBody Location location) {
		locationService.addLocation(location);
		return "location added";
		
	}

}
