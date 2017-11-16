package com.calogardev.simplespringdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.calogardev.simplespringdemo.model.User;
import com.calogardev.simplespringdemo.service.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/{userId}", method = RequestMethod.GET)
	private User findOne(@PathVariable("userId") Integer userId) {
		return userService.findOne(userId);
	}

	@RequestMapping(method = RequestMethod.GET)
	private List<User> findAll() {
		return userService.findAll();
	}

	@RequestMapping(method = RequestMethod.POST)
	private User create(@RequestBody User user) {
		return userService.save(user);
	}

	@RequestMapping(value = "/{userId}", method = RequestMethod.PUT)
	private User update(@PathVariable("userId") Integer userId, @RequestBody User user) {
		user.setId(userId);
		return userService.save(user);
	}

	@RequestMapping(value = "/{userId}", method = RequestMethod.DELETE)
	private void delete(@PathVariable("userId") Integer userId) {
		final User user = userService.findOne(userId);
		userService.delete(user);
	}
}
