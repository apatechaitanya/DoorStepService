package com.service.All;

import java.util.List;
import java.util.Optional;

import com.DoorStepService.model.Workers;

public interface Worker_Service_Interface {

	public void addWorker(Workers worker);
	public List<Workers> getWorker();
	public Optional<Workers> fetchWorkerById(long id);
	public Workers updateWorker(Workers worker);
	public void removeWorker(Long worker_id);
	
	
}
