package com.users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.users.dto.UserDepartmentVO;
import com.users.entity.User;
import com.users.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/users")
@Slf4j
public class UsersController {

	@Autowired
	private UserService service;
	
	@PostMapping("/save")
	public  User addUser(@RequestBody User user){
		log.info("inside addUser");
		return service.addUser(user);
	}
	
	@GetMapping("getUserByID")
	public UserDepartmentVO getUserByID(@RequestParam("id") int userId) {
		log.info("inside getUserByID");
		return service.addUser(userId);
	}
}
