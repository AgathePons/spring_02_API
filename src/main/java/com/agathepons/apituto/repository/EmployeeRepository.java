package com.agathepons.apituto.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.agathepons.apituto.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}