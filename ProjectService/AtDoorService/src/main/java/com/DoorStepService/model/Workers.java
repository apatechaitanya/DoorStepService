package com.DoorStepService.model;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="workers")
public class Workers {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long worker_id;
	private String first_name;
	private String last_name;
	private String emailId;
	private long mobile;
	private boolean verified;
	
	@OneToOne(cascade = CascadeType.ALL,targetEntity = Address.class)
	@JoinColumn(name = "address_id")
	private Address address;
	
	/*@OneToMany(cascade = CascadeType.ALL,targetEntity = Orders.class)
	@JoinColumn(name="orders_id")
	private List<Orders> orders;*/
	@ManyToOne(fetch= FetchType.EAGER,targetEntity = Profession.class)
	@JoinColumn(name="prof_id")
	private Profession profession;
	public Workers() {
		super();
	}
	public Workers(long worker_id, String first_name, String last_name, String emailId, long mobile, boolean verified,
			Address address ,Profession profession) {
		super();
		this.worker_id = worker_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.emailId = emailId;
		this.mobile = mobile;
		this.verified = verified;
	//	this.orders = orders;
		this.address=address;
		this.profession = profession;
	}
	public long getWorker_id() {
		return worker_id;
	}
	public void setWorker_id(long worker_id) {
		this.worker_id = worker_id;
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
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public boolean isVerified() {
		return verified;
	}
	public void setVerified(boolean verified) {
		this.verified = verified;
	}
/*	public List<Orders> getOrders() {
		return orders;
	}
	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}*/
	public Profession getProfession() {
		return profession;
	}
	public void setProfession(Profession profession) {
		this.profession = profession;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}