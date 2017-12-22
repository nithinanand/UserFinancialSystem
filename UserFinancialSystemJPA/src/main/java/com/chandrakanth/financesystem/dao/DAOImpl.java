package com.chandrakanth.financesystem.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.chandrakanth.financesystem.entity.UserCredentials;

@Component
public class DAOImpl {

	@PersistenceContext
	private EntityManager em;

	public EntityManager getEm() {
		return em;
	}

	@Transactional
	public void persistValues(UserCredentials userCredentials) {
		em.persist(userCredentials);
		
	}
	
	
	                          
	

}
