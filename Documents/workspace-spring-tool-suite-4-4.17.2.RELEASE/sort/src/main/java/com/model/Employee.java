package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Employee {
	@Id
	private Long id;
	private String name;
	private double Salary;
	private String dept;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Salary=" + Salary + ", dept=" + dept + "]";
	}
	public Employee(Long id, String name, double salary, String dept) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
		this.dept = dept;
	}
	public Employee()
	{
		
	}
}
