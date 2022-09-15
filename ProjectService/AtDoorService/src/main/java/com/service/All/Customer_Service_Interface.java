package com.service.All;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.DoorStepService.model.Customers;


public interface Customer_Service_Interface {

	public void addCustomer(Customers customer);
	public List<Customers> getCustomers();
	public Optional<Customers> fetchCustomerById(long id);
	public Customers updateCustomer(Customers location);
	public void removeCustomer(Long cust_id);
	
}
