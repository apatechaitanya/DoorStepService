package com.Dao.All;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.DoorStepService.model.Customers;


@Component
public class CustomerDao {
	@PersistenceContext//(unitName = "my-pu1")
	private EntityManager entityManager;
	
	@Transactional
	public void addCustomer(Customers customer) {
		entityManager.persist(customer);
		
	}
	public List<Customers> customerList() {
		return entityManager
				.createQuery("select c from Customer c")
				.getResultList();
		
	}
	
	public Customers getCustomerById(int id) {
		return (Customers) entityManager
				.createQuery("select c from Customer c where c.customer_id=:idn")
				.setParameter("idn", id)
				.getSingleResult();
		
	}
	
	@Transactional
	public void updateCustomer(Customers customer) {
		System.out.println("Entered update Customer");
		entityManager.merge(customer);		
	}
	
	@Transactional
	public void removeCustomer(Customers customer) {
//		System.out.println("location id in Dao : "+customer.getCustomer_id());
	}
	
}
