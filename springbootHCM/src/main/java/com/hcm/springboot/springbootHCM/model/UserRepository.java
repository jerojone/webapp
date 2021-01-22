package com.hcm.springboot.springbootHCM.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, String> {
	
	@Query("select  u from User u where altId = ?1")
	User findByAltId(String altId);
	

}
