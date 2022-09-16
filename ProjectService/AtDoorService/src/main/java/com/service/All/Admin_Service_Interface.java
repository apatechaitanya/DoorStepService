package com.service.All;

import java.util.List;
import java.util.Optional;

import com.DoorStepService.model.Admin;
import com.DoorStepService.model.Profession;
import com.DoorStepService.model.Workers;
import com.servicr.payload.AdminuserPayload;

public interface Admin_Service_Interface {

	
	public void addAdmin(AdminuserPayload adminPayload);
	//public List<Admin> getAdmin();
	public Optional<Admin> fetchAdminById(String id);
	//public void updateWorker(Workers worker);
	public void removeAdmin(String username);
	
	
}
