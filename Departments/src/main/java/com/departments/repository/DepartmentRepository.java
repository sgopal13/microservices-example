package com.departments.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.departments.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
