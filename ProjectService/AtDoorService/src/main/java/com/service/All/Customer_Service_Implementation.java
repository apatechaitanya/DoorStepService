package com.service.All;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.Dao.All.CustomerDao;
import com.DoorStepService.model.Customers;

public class Customer_Service_Implementation implements Customer_Service_Interface {

	
	@Autowired
	CustomerDao customerdao;
	
	@Override
	public void addCustomer(Customers customer) {
		customerdao.addCustomer(customer);
		
	}

	@Override
	public List<Customers> getCustomers() {
		// TODO Auto-generated method stub
		return customerdao.customerList();
	}

	@Override
	public Customers fetchCustomerById(int id) {
		// TODO Auto-generated method stub
		return customerdao.getCustomerById(id);
	}

	@Override
	public void updateCustomer(Customers customer) {
		customerdao.updateCustomer(customer);
		
	}

	@Override
	public void removeCustomer(Customers customer) {
		customerdao.removeCustomer(customer);
		
	}

}
