package com.calogardev.simplespringdemo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.calogardev.simplespringdemo.model.User;

@Repository
public interface UserDao extends CrudRepository<User, Integer> {

	User findOne(Integer id);

	List<User> findAll();

	User save(User user);

	void delete(User user);

	User findUserByUsername(String username);

	void deleteAllInBatch();
}
