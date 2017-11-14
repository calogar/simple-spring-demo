package com.calogardev.simplespringdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.calogardev.simplespringdemo.model.User;
import com.calogardev.simplespringdemo.service.UserService;

@SpringBootApplication
public class SimpleSpringDemoApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(SimpleSpringDemoApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {

		userService.save(new User("it's me", "123456"));
		userService.save(new User("it's also me", "123123"));
		userService.save(new User("it's me again!", "987654321"));
	}
}
