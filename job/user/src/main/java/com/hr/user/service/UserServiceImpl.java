package com.hr.user.service;

import org.springframework.stereotype.Service;

import com.hr.user.domain.User;

@Service
class UserServiceImpl  implements UserService{

	@Override
	public User getUserDetails() {
		return new User(1L, "test");
	}
	

}
