package com.service.All;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DoorStepService.model.Workers;
import com.service.Dao.WorkerDao;

@Service
public class Worker_Service_Implementation implements Worker_Service_Interface {

	@Autowired
	public WorkerDao workerdao;
	
	@Override
	public void addWorker(Workers worker) {
		// TODO Auto-generated method stub
		workerdao.save(worker);
		
	}

	@Override
	public List<Workers> getWorker() {
		// TODO Auto-generated method stub
		return workerdao.findAll();
	}

	@Override
	public Optional<Workers> fetchWorkerById(long id) {
		// TODO Auto-generated method stub
		return workerdao.findById(id);
	}

	@Override
	public Workers updateWorker(Workers worker) {
		// TODO Auto-generated method stub
		return workerdao.save(worker);
	}

	@Override
	public void removeWorker(Long worker) {
		// TODO Auto-generated method stub
		workerdao.deleteById(worker);
	}

}
