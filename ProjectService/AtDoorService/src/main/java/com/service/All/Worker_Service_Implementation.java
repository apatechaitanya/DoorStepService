package com.service.All;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.Dao.All.CustomerDao;
import com.Dao.All.WorkerDao;
import com.DoorStepService.model.Workers;

public class Worker_Service_Implementation implements Worker_Service_Interface {

	@Autowired
	WorkerDao workerdao;
	
	@Override
	public void addWorker(Workers worker) {
		// TODO Auto-generated method stub
		workerdao.addWorker(worker);
		
	}

	@Override
	public List<Workers> getWorker() {
		// TODO Auto-generated method stub
		return workerdao.workersList();
	}

	@Override
	public Workers fetchWorkerById(int id) {
		// TODO Auto-generated method stub
		return workerdao.getWorkerById(id);
	}

	@Override
	public void updateWorker(Workers worker) {
		// TODO Auto-generated method stub
		workerdao.updateWorker(worker);
	}

	@Override
	public void removeWorker(Workers worker) {
		// TODO Auto-generated method stub
		workerdao.removeWorker(worker);
	}

}
