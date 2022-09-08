package com.service.All;

import java.util.List;

import com.DoorStepService.model.Customers;

public interface Customer_Service_Interface {

	public void addCustomer(Customers customer);
	public List<Customers> getCustomers();
	public Customers fetchCustomerById(int id);
	public void updateCustomer(Customers location);
	public void removeCustomer(Customers location);
	
	
	
}
