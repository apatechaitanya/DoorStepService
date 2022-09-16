package com.service.All;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DoorStepService.model.Address;
import com.DoorStepService.model.Customers;
import com.service.Dao.CustomerDao;
import com.servicr.payload.CustomerPayload;

@Service
public class Customer_Service_Implementation implements Customer_Service_Interface {

	
	@Autowired
	CustomerDao customerdao;
	
	@Override
	public void addCustomer(CustomerPayload customerpayload) {
		
		Customers customer =new Customers();
		customer.setFirst_name(customerpayload.getFirst_name());
		customer.setLast_name(customerpayload.getLast_name());
		customer.setEmailId(customerpayload.getEmailId());
		customer.setPassword(customerpayload.getPassword());
		customer.setMobile(customerpayload.getMobile());
		
		
		Address add =new Address();
		add.setCity(customerpayload.getCity());
		add.setLandmark(customerpayload.getLandmark());
		add.setPincode(customerpayload.getPincode());
		add.setState(customerpayload.getState());
		
		customer.setAddress(add);
		
		customerdao.save(customer);
		
	}

	@Override
	public List<Customers> getCustomers() {
		// TODO Auto-generated method stub
		return customerdao.findAll();
	}

	@Override
	public Customers fetchCustomerById(long id) {
		// TODO Auto-generated method stub
		return customerdao.findById(id).orElse(null);
	}

	@Override
	public Customers updateCustomer(CustomerPayload customerpayload,Long id) {
		
		Customers customer =new Customers();
		customer.setFirst_name(customerpayload.getFirst_name());
		customer.setLast_name(customerpayload.getLast_name());
		customer.setEmailId(customerpayload.getEmailId());
		customer.setPassword(customerpayload.getPassword());
		customer.setMobile(customerpayload.getMobile());
		customer.setId(id);
		
		
		Address add =new Address();
		add.setCity(customerpayload.getCity());
		add.setLandmark(customerpayload.getLandmark());
		add.setPincode(customerpayload.getPincode());
		add.setState(customerpayload.getState());
		
		customer.setAddress(add);
		
		customerdao.save(customer);
		
		
		
		System.out.println("ID comming in service "+customer.getId());
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
