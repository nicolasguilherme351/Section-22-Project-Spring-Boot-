package com.educandoweb.course.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity 
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Double salary; 
	
	@ManyToOne
	@JoinColumn(name = "department_Id")
	private Department department;

	public Employee(Long id, String name, Double salary, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
	
	
	
}
