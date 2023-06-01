package com.autobots.kafka.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.autobots.kafka.dto.User;

@Service
public class UserConsumerListener {

	@KafkaListener(topics = { "user-topic" })
	public void consumerUserData(User user) {
		System.out.println("Users Age Is: " + user.getAge()+" Fav Genre "+user.getFavGenre());
	}
}
