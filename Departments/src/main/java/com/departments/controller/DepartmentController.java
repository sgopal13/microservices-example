package com.departments.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.departments.entity.Department;
import com.departments.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

	@Autowired
	private DepartmentService  departmentService;
	
	@PostMapping("/save")
	public Department addDepartment(@RequestBody Department department){
		log.info("inside addDepartment");
		return departmentService.addDepartment(department);
	}
	
	@GetMapping("/getDepartmentById")
	public Department getDepartmentById(@RequestParam("deptId") int deptId) {
		return departmentService.getDepartmentById(deptId);
	}
}
