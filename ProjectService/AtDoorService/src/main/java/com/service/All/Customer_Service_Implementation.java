package com.service.All;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.DoorStepService.model.Customers;
import com.service.Dao.CustomerDao;

@Service
public class Customer_Service_Implementation implements Customer_Service_Interface {

	
	@Autowired
	CustomerDao customerdao;
	
	@Override
	public void addCustomer(Customers customer) {
		 customerdao.save(customer);
		
	}

	@Override
	public List<Customers> getCustomers() {
		// TODO Auto-generated method stub
		return customerdao.findAll();
	}

	@Override
	public Optional<Customers> fetchCustomerById(long id) {
		// TODO Auto-generated method stub
		return customerdao.findById(id);
	}

	@Override
	public Customers updateCustomer(Customers customer) {
		return customerdao.save(customer);
		
	}

/*	@Override
	public void removeCustomer(Customers customer) {
		customerdao.delete(customer);
		
	}*/

	@Override
	public void removeCustomer(Long cust_id) {
		// TODO Auto-generated method stub
		 customerdao.deleteById(cust_id); 
	}
	
	
	

}
