package com.service.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.DoorStepService.model.Customers;
import com.service.All.Customer_Service_Interface;

@RestController
public class CustomerController {
	
	@Autowired
	Customer_Service_Interface customerInterface;

	//------------Add new customer-------------------------
	
	@PostMapping("/Registration")
	
	
		public void addcustomer(@RequestBody Customers customer){
			 System.out.println("ENtered locadd");		
			    
			 System.out.println(customer.getFirst_name());
			customerInterface.addCustomer(customer);	
	}
	
	
	//------------GetAll new customer-------------------------
	
	@GetMapping("/AllCustomers")
	public List<Customers> getAllCustomers(){
	return customerInterface.getCustomers();
	}
	
	
	//------------GetAll customer by ID-------------------------
	
	@GetMapping("/GetCustomers/{cust_id}")
	public Customers getCustomer(@PathVariable Long cust_id){
	return customerInterface.fetchCustomerById(cust_id).orElse(null);
	}
	
	
	//------------Delete customer-------------------------
	
	@DeleteMapping("/Customer/{cust_id}")
	public void deleteCustomer(@PathVariable Long cust_id){
		 customerInterface.removeCustomer(cust_id);
		}
	
	
	//------------Update customer-------------------------
	@PutMapping("/Customers")
	public Customers updatecustomer(@RequestBody Customers customer){    	
		return customerInterface.updateCustomer(customer);
				
}
	
}

