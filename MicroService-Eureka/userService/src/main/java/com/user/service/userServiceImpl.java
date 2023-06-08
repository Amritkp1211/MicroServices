package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class userServiceImpl implements userService {

	List<User> list=List.of(
			              new User(1001L,"Amrit","786849302"),
			              new User(1002L,"Dinesh","9435469302"),
			              new User(1003L,"Gordan","98849302")
			);
	
	@Override
	public User getUser(Long uId) {
		
		return this.list.stream().filter(user->user.getuId().equals(uId)).findAny().orElse(null);
	}

}
