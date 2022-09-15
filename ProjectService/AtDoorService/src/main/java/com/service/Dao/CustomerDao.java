package com.service.Dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DoorStepService.model.Customers;



@Repository
public interface CustomerDao extends JpaRepository<Customers,Long>{
	
	
}
