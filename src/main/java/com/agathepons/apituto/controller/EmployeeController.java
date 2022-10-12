package com.agathepons.apituto.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.agathepons.apituto.model.Employee;
import com.agathepons.apituto.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	/**
	 * Read - Get all employees
	 * @return iterable object of all employees full filled
	 */
	@GetMapping("/employees")
	public Iterable<Employee> getEmployees() {
		return employeeService.getEmployees();
	}
	
	/**
	 * Read - Get one employee by id
	 * @param id - Id of the employee to get
	 * @return Employee object full filled
	 */
	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable("id") final Long id) {
		Optional<Employee> employee = employeeService.getEmployee(id);
		if (employee.isPresent()) {
			return employee.get();
		} else {
			return null;
		}
	}
}
