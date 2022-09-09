package com.Dao.All;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.DoorStepService.model.Workers;

@Component
public class WorkerDao  {
	@PersistenceContext//(unitName = "my-pu1")
	private EntityManager entityManager;
	
	@Transactional
	public void addWorker(Workers worker) {
		entityManager.persist(worker);
		
	}
	public List<Workers> workersList() {
		return entityManager
				.createQuery("select w from Worker w")
				.getResultList();
		
	}
	
	public Workers getWorkerById(int id) {
		return (Workers) entityManager
				.createQuery("select w from Worker w where w.worker_id=:idn")
				.setParameter("idn", id)
				.getSingleResult();
		
	}
	
	@Transactional
	public void updateWorker(Workers worker) {
		System.out.println("Entered update Worker");
		entityManager.merge(worker);		
	}
	
	@Transactional
	public void removeWorker(Workers worker) {
		System.out.println("location id in Dao : "+worker.getWorker_id());
	}
	
}
