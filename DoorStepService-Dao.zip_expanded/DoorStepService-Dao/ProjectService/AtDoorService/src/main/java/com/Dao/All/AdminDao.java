package com.Dao.All;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.DoorStepService.model.Admin;
import com.DoorStepService.model.Workers;

public class AdminDao {

	@PersistenceContext//(unitName = "my-pu1")
	private EntityManager entityManager;
	
	@Transactional
	public void addAdmin(Admin admin) {
		// TODO Auto-generated method stub
		entityManager.persist(admin);
		
	}

	public Admin getAdminById(int id) {
		return (Admin) entityManager
				.createQuery("select a from Admin a where a.admin_id=:idn")
				.setParameter("idn", id)
				.getSingleResult();
	}

	
	
	
	
}
