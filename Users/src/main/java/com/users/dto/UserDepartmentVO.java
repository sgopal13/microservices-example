package com.users.dto;

import com.users.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDepartmentVO {
	private User user;
	private DepartmentVO departmentVO;
}
