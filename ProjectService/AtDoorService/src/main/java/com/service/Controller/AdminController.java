package com.service.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DoorStepService.model.Admin;
import com.DoorStepService.model.Customers;
import com.DoorStepService.model.Profession;
import com.DoorStepService.model.Workers;
import com.service.All.Admin_Service_Interface;
import com.service.All.Worker_Service_Interface;


@RestController
@RequestMapping("/Admin/Controller")
@CrossOrigin(origins = "http://localhost:3000")
public class AdminController {

	@Autowired
	Admin_Service_Interface adminInterface;
	
	//------------Add new Admin-------------------------
	
		@PostMapping("/RegistrationAdmin")
		
		
			public void addadmin(@RequestBody Admin admin){
				 System.out.println("ENtered admin controller");
				 System.out.println("NAme"+ admin.getUsername());
				 System.out.println("Address "+admin.getAddress());
				
				 adminInterface.addAdmin(admin);	
		}
		
		
		//------------Get Admin by ID-------------------------
		
		@GetMapping("/GetCustomers/{admin_id}")
		public Admin getAdmin(@PathVariable String admin_id){
		return adminInterface.fetchAdminById(admin_id).orElse(null);
		}
		
		//------------Delete Admin-------------------------
		
		@DeleteMapping("/RemoveAdmin/{username}")
		public void deleteCustomer(@PathVariable String username){
			adminInterface.removeAdmin(username);
			}
		
		
			
	
}
