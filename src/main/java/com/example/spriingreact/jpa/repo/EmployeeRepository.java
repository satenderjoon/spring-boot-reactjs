package com.example.spriingreact.jpa.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.spriingreact.jpa.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
