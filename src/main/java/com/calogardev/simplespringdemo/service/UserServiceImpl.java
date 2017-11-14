package com.calogardev.simplespringdemo.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.calogardev.simplespringdemo.dao.UserDao;
import com.calogardev.simplespringdemo.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

	@Override
	public User findOne(Integer id) {
		log.info("Find user with id = " + id);
		return userDao.findOne(id);
	}

	@Override
	public List<User> findAll() {
		log.info("Find all users");
		return userDao.findAll();
	}

	@Override
	public User save(User user) {
		if (user.getId() == null) {
			// Not persisted yet
			log.info("Create user with username = " + user.getUsername());
		} else {
			log.info("Update user with id = " + user.getId());
		}
		return userDao.save(user);
	}

	@Override
	public void delete(User user) {
		log.info("Delete user with id = " + user.getId());
		userDao.delete(user);
	}

	@Override
	public User findUserByUsername(String username) {
		log.info("Find user with username = " + username);
		return userDao.findUserByUsername(username);
	}

}
