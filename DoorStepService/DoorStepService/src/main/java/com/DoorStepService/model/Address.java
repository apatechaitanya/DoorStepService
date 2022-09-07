package com.DoorStepService.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long address_id;
	private String city;
	private String landmark;
	private int pincode;
	private String state;
	@OneToOne(targetEntity = workers.class)
	@JoinColumn(name="worker_id")
	private workers worker;
	@OneToOne(targetEntity = Customers.class)
	@JoinColumn(name="cust_id")
	private Customers customers;
	public Address(long address_id, String city, String landmark, int pincode, String state, workers worker,
			Customers customers) {
		super();
		this.address_id = address_id;
		this.city = city;
		this.landmark = landmark;
		this.pincode = pincode;
		this.state = state;
		this.worker = worker;
		this.customers = customers;
	}
	public Address() {
		super();
	}
	
	public long getId() {
		return address_id;
	}
	public long getAddress_id() {
		return address_id;
	}
	public void setAddress_id(long address_id) {
		this.address_id = address_id;
	}
	public workers getWorker() {
		return worker;
	}
	public void setWorker(workers worker) {
		this.worker = worker;
	}
	public Customers getCustomers() {
		return customers;
	}
	public void setCustomers(Customers customers) {
		this.customers = customers;
	}
	public void setId(long id) {
		this.address_id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
