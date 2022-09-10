package com.service.All;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;


import com.DoorStepService.model.Admin;
import com.service.Dao.AdminDao;

public class Admin_Service_Implementation implements Admin_Service_Interface {

	@Autowired
	AdminDao admindao; 
	
	
	
	@Override
	public void addAdmin(Admin admin) {
		admindao.save(admin);
		
	}

	@Override
	public Optional<Admin> fetchAdminById(String id) {
		// TODO Auto-generated method stub
		return admindao.findById(id);
	}

}
