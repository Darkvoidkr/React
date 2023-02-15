package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.EmployeeService;
import com.model.Employee;

@RestController
public class EmployeeController
{
	@Autowired
	EmployeeService empService;
	@GetMapping("/sortEmployees/{field}")
	public Iterable<Employee> getEmployeeSorted(@PathVariable("field") String field)
	{
		return empService.sortEmp(field);
	}
}

