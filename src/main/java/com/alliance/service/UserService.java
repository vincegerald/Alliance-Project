package com.alliance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alliance.entity.User;
import com.alliance.repository.UserRepository;

@Service("userService")
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public List<User> getUserList(User user){
		List<User> UserList = userRepository.findAll();
		return UserList;
	}
	
	public User saveUser(User user) {
		return userRepository.save(user);
	}
	
	public User getUserById(int id) {
		return userRepository.findOne(id);
	}
	
	public List<User> getUserByUserStatus(String status) {
		return userRepository.findUserByUserStatus(status);
	}
}
