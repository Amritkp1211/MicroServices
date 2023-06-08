package com.contact.controller;

import java.util.List;
import java.util.function.LongFunction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.entity.Contact;
import com.contact.service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {
    
	@Autowired
	private ContactService contactService;
	
	@GetMapping("/user/{id}")
	public List<Contact> getcontact(@PathVariable("id") Long id){
		return contactService.getContactofUser(id);
	}
}
