package com.jonali.pma.dao;

import org.springframework.data.repository.CrudRepository;

import com.jonali.pma.entities.Employee;


public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
