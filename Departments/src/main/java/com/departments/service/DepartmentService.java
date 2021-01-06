package com.departments.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.departments.entity.Department;
import com.departments.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department addDepartment(Department department) {
		return departmentRepository.save(department);
	}

	public Department getDepartmentById(int deptId) {
		Optional<Department> optional = departmentRepository.findById(deptId);
		return optional.get();
	}
}
