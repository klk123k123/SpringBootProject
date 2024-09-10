package com.SpringBoot.model;

public class Student {

	private Long id;
	private String fullName;
	private String emailId;
	
	//constructor
	public Student(Long id, String fullName, String emailId) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.emailId = emailId;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
}
