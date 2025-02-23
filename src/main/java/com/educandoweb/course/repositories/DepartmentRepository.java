package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
