package com.DoorStepService.model;


import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="orders")
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long orders_id;
	private double amount;
	private String status;
	private Date orderdate;
	@OneToMany(targetEntity = Customers.class)
	private List<Customers> customer;
	@OneToMany(targetEntity = Workers.class)
	private List<Workers> workers;
	public Orders(long orders_id, double amount, String status, Date orderdate, List<Customers> customer,
			List<com.DoorStepService.model.Workers> workers) {
		super();
		this.orders_id = orders_id;
		this.amount = amount;
		this.status = status;
		this.orderdate = orderdate;
		this.customer = customer;
		this.workers = workers;
	}
	public long getOrders_id() {
		return orders_id;
	}
	public void setOrders_id(long orders_id) {
		this.orders_id = orders_id;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}
	public List<Customers> getCustomer() {
		return customer;
	}
	public void setCustomer(List<Customers> customer) {
		this.customer = customer;
	}
	public List<Workers> getWorkers() {
		return workers;
	}
	public void setWorkers(List<Workers> workers) {
		this.workers = workers;
	}
	
	
}