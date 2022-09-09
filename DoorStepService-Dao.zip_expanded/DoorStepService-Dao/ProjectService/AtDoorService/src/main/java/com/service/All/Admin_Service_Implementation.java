package com.service.All;

import org.springframework.beans.factory.annotation.Autowired;

import com.Dao.All.AdminDao;
import com.DoorStepService.model.Admin;

public class Admin_Service_Implementation implements Admin_Service_Interface {

	@Autowired
	AdminDao admindao; 
	
	
	
	@Override
	public void addAdmin(Admin admin) {
		admindao.addAdmin(admin);
		
	}

	@Override
	public Admin fetchAdminById(int id) {
		// TODO Auto-generated method stub
		return admindao.getAdminById(id);
	}

}
