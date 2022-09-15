package com.service.All;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DoorStepService.model.Admin;
import com.DoorStepService.model.Profession;
import com.service.Dao.AdminDao;

@Service
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

	@Override
	public void removeAdmin(String username) {
		// TODO Auto-generated method stub
		admindao.deleteById(username);
	}

	
}
