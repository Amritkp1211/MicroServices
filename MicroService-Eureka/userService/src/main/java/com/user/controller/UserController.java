package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.entity.User;
import com.user.service.userService;

@RestController
@RequestMapping("/user")
public class UserController {
    
	@Autowired
	private userService userService;
    
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{id}")
	public User getUser(@PathVariable("id") Long id) {
		 User u1 = userService.getUser(id);
		 //http://localhost:9002/contact/user/1001
		 
		 List list = this.restTemplate.getForObject("http://user-service/contact/user/"+u1.getuId(),List.class);
	        u1.setContacts(list);
		 return u1;
        
	}
}
