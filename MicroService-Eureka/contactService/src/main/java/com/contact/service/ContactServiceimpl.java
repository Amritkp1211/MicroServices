package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;
@Service
public class ContactServiceimpl implements ContactService{

	 List<Contact> list1=List.of(
			         new Contact(101L,"Amrit","amritkp@gmail",1001L),
			         new Contact(101L,"Amit","amit@gmail",1001L),
			         new Contact(102L,"Anurag","akp@gmail",1002L),
			         new Contact(103L,"Kalpesh","kp@gmail",1003L)    
			 ); 
	
	@Override
	public List<Contact> getContactofUser(Long uId) {

		return list1.stream().filter(contact->contact.getuId().equals(uId)).collect(Collectors.toList());
	}

}
