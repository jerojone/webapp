package com.hcm.springboot.springbootHCM.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
	

}
