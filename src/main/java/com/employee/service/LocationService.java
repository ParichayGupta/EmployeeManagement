package com.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.model.Location;
import com.employee.repository.LocationRepository;

@Service
public class LocationService {

	@Autowired
	private LocationRepository locationRepository;

//	Add new Location
	public void addLocation(Location location) {
		locationRepository.save(location);
	}

//	Get all locations
	public List<Location> getAllLocations() {
		return locationRepository.findAll();
	}

}
