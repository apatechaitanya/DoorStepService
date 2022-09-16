package com.service.All;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DoorStepService.model.Address;
import com.DoorStepService.model.Admin;
import com.DoorStepService.model.Profession;
import com.service.Dao.AdminDao;
import com.servicr.payload.AdminuserPayload;

@Service
public class Admin_Service_Implementation implements Admin_Service_Interface {

	@Autowired
	AdminDao admindao; 
	
	
	
	@Override
	public void addAdmin(AdminuserPayload adminuserPayload) {
		
		Admin admin =new Admin();
		
		admin.setUsername(adminuserPayload.getUsername());
		admin.setPassword(adminuserPayload.getPassword());
		admin.setEmailId(adminuserPayload.getEmailId());
		admin.setMobileno(adminuserPayload.getMobileno());
		
		Address add =new Address();
		add.setCity(adminuserPayload.getCity());
		add.setLandmark(adminuserPayload.getLandmark());
		add.setPincode(adminuserPayload.getPincode());
		add.setState(adminuserPayload.getState());
		
		
		admin.setAddress(add);
		
		
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
