package com.DoorStepService.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {
	@Id
	private String username;
	private String password;
	private String emailId;
	private long mobileno;
	public Admin(String username, String password, String emailId, long mobileno) {
		super();
		this.username = username;
		this.password = password;
		this.emailId = emailId;
		this.mobileno = mobileno;
	}

	public Admin() {
		super();
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}