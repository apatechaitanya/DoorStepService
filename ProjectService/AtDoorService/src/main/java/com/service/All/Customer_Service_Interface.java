package com.service.All;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.DoorStepService.model.Customers;
import com.servicr.payload.CustomerPayload;


public interface Customer_Service_Interface {

	public void addCustomer(CustomerPayload customerpayload);
	public List<Customers> getCustomers();
	public Customers fetchCustomerById(long id);
	public Customers updateCustomer(CustomerPayload customerpayload,Long id);
	public void removeCustomer(Long cust_id);
	
}
