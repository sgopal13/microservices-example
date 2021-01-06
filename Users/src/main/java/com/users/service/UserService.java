package com.users.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.users.dto.DepartmentVO;
import com.users.dto.UserDepartmentVO;
import com.users.entity.User;
import com.users.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public User addUser(User user) {
		return repository.save(user);
	}

	public UserDepartmentVO addUser(int userId) {
		Optional<User> optional = repository.findById(userId);
		DepartmentVO departmentVO = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/getDepartmentById?deptId="+1, DepartmentVO.class);
		UserDepartmentVO UserDepartmentVO = new UserDepartmentVO();
		UserDepartmentVO.setDepartmentVO(departmentVO);
		UserDepartmentVO.setUser(optional.get());
		return UserDepartmentVO;
	}

}
