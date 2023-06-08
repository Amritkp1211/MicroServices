package com.user.entity;

public class Contact {
  
	private Long cId;
	private String cName;
	private String email;
	
	private Long uId;

	public Contact(Long cId, String cName, String email, Long uId) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.email = email;
		this.uId = uId;
	}

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getcId() {
		return cId;
	}

	public void setcId(Long cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getuId() {
		return uId;
	}

	public void setuId(Long uId) {
		this.uId = uId;
	}

	@Override
	public String toString() {
		return "Contact [cId=" + cId + ", cName=" + cName + ", email=" + email + ", uId=" + uId + "]";
	}
	
}
