package com.user.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
 
	private Long uId;
	private String name;
	private String phone;
	
	List<Contact> contacts=new ArrayList<>();

	public Long getuId() {
		return uId;
	}

	public void setuId(Long uId) {
		this.uId = uId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

	@Override
	public String toString() {
		return "User [uId=" + uId + ", name=" + name + ", phone=" + phone + "]";
	}

	public User(long uId, String name, String phone, List<Contact> contacts) {
		super();
		this.uId = uId;
		this.name = name;
		this.phone = phone;
		this.contacts = contacts;
	}

	public User(long uId, String name, String phone) {
		super();
		this.uId = uId;
		this.name = name;
		this.phone = phone;
	}
	
}
