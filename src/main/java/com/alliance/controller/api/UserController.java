package com.alliance.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alliance.entity.User;
import com.alliance.service.UserService;

@RestController(value = "userApiController")
@RequestMapping(value = "/api/users")
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping("/read")
	public List<User> getBorrowerList(User user) {
		return userService.getUserByUserStatus("IN");
	}
	
	@RequestMapping("/add")
	public User saveUser() {
		User user = new User();
		user.setUserFname("Cloie Andrea");
		user.setUserLname("Allera");
		user.setUserType("B");
		user.setUserStatus("AC");
		return userService.saveUser(user);
	}
	
	@RequestMapping("/update")
	public User updateUser() {
		User user = userService.getUserById(1);
		user.setUserFname("Cloie");
		return userService.saveUser(user);
	}
	
	@RequestMapping("/delete")
	public User deleteBorrower() {
		User user = userService.getUserById(2);
		user.setUserStatus("IN");
		return userService.saveUser(user);
	}
}
