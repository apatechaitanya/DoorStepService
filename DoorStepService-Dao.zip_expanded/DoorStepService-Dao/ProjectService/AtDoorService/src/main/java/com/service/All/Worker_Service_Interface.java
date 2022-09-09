package com.service.All;

import java.util.List;

import com.DoorStepService.model.Workers;

public interface Worker_Service_Interface {

	public void addWorker(Workers worker);
	public List<Workers> getWorker();
	public Workers fetchWorkerById(int id);
	public void updateWorker(Workers worker);
	public void removeWorker(Workers worker);
	
	
}
