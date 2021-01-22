package com.hcm.springboot.springbootHCM.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.hcm.springboot.springbootHCM.model.CustomUserDetails;
import com.hcm.springboot.springbootHCM.model.User;
import com.hcm.springboot.springbootHCM.model.UserRepository;

public class CustomUserDetailsServices implements UserDetailsService {

	@Autowired
	private UserRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String altId) throws UsernameNotFoundException {
		User user = repo.findByAltId(altId);
		if(user == null) {
			throw new UsernameNotFoundException("User Not Found....");
		}
		return new CustomUserDetails(user);
	}

}
