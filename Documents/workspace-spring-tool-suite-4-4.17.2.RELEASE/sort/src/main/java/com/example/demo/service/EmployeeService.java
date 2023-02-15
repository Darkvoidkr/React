package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.Repos;
import com.model.Employee;

@Service
public class EmployeeService {
	@Autowired
	Repos empRepos;
	public Iterable<Employee> sortEmp(String field)
	{
		return empRepos.findAll(Sort.by(field));
	}
}
