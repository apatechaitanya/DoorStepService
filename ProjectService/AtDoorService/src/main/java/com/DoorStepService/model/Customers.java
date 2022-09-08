package com.DoorStepService.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import java.util.List;

@Entity
@Table(name="customers")
public class Customers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long cust_id;
	private String first_name;
	private String last_name;
	private String emailId;
	private String password;
	private long mobile;
	@OneToOne(cascade = CascadeType.ALL,targetEntity = Address.class)
	@JoinColumn(name = "address_id")
	private Address address;
	@OneToMany(targetEntity = Orders.class,cascade = CascadeType.ALL)
	@JoinColumn(name="orders_id")
	private List<Orders> orders;
	public Customers() {
		super();
	}
	public Customers(long cust_id, String first_name, String last_name, String emailId, String password, long mobile,
			Address address) {
		super();
		this.cust_id = cust_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.emailId = emailId;
		this.password = password;
		this.mobile = mobile;
		this.address = address;
	}
	public long getId() {
		return cust_id;
	}
	public void setId(long cust_id) {
		this.cust_id = cust_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}