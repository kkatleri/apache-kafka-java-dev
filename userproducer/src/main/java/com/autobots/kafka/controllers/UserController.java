package com.autobots.kafka.controllers;

import com.autobots.kafka.dto.User;
import com.autobots.kafka.listener.UserProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userapi")
public class UserController {

	@Autowired
	private UserProducerService service;

	@PostMapping("/publishUserData")
	public void sendUserData(@RequestBody User user) {
		service.sendUserData(user);
	}
}
