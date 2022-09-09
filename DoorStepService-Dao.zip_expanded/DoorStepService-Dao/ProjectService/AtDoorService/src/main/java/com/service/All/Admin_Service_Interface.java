package com.service.All;

import java.util.List;

import com.DoorStepService.model.Admin;
import com.DoorStepService.model.Workers;

public interface Admin_Service_Interface {

	
	public void addAdmin(Admin admin);
	//public List<Admin> getAdmin();
	public Admin fetchAdminById(int id);
	//public void updateWorker(Workers worker);
	//public void removeWorker(Workers worker);
	
}
