package com.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.model.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer>{

}
