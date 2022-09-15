package com.service.Dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DoorStepService.model.Admin;
import com.DoorStepService.model.Customers;
import com.DoorStepService.model.Profession;
import com.DoorStepService.model.Workers;


@Repository
public interface AdminDao extends JpaRepository<Admin,String>  {

	

	/*@PersistenceContext//(unitName = "my-pu1")
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

	
	
	*/
	
}
