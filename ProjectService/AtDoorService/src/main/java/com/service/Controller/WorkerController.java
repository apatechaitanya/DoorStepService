package com.service.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.DoorStepService.model.Customers;
import com.DoorStepService.model.Workers;
import com.service.All.Customer_Service_Interface;
import com.service.All.Worker_Service_Interface;

@RestController
public class WorkerController {

	@Autowired
	Worker_Service_Interface workerInterface;

	//------------Add new Worker-------------------------
	
	@PostMapping("/RegistrationWorker")
	
	
		public void addworker(@RequestBody Workers worker){
			 System.out.println("ENtered locadd");		
			 workerInterface.addWorker(worker);	
	}
	
	
	//------------GetAll new Worker-------------------------
	
	@GetMapping("/AllWorker")
	public List<Workers> getAllWorkers(){
	return workerInterface.getWorker();
	}
	
	
	//------------GetAll Worker by ID-------------------------
	
	@GetMapping("/GetWorker/{worker_id}")
	public Workers getCustomer(@PathVariable Long worker_id){
		
		
	return workerInterface.fetchWorkerById(worker_id).orElse(null);
	}
	
	
	//------------Delete Worker-------------------------
	
	@DeleteMapping("/Worker/{worker_id}")
	public void deleteCustomer(@PathVariable Long worker_id){
		workerInterface.removeWorker(worker_id);
		}
	
	
	//------------Update worker-------------------------
	@PutMapping("/Worker")
	public Workers updatecustomer(@RequestBody Workers worker){    	
		return workerInterface.updateWorker(worker);
				
}
	
}
