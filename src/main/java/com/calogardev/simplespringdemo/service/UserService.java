package com.calogardev.simplespringdemo.service;

import java.util.List;

import com.calogardev.simplespringdemo.model.User;

public interface UserService {

	User findOne(Integer id);

	List<User> findAll();

	User save(User user);

	void delete(User user);

	User findUserByUsername(String username);
}
