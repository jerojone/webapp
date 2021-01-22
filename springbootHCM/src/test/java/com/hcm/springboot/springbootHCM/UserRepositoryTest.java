package com.hcm.springboot.springbootHCM;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.annotation.Rollback;

import com.hcm.springboot.springbootHCM.model.User;
import com.hcm.springboot.springbootHCM.model.UserRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTest {

	@Autowired
	private UserRepository repo;
	
	@Autowired
	private TestEntityManager entityManager;
	
	@Test
	public void testCreateUser() {
		User user = new User();
		
		user.setAltId("9013");
		user.isEnabled();
		user.setfName("Naveen Raj");
		user.setlName("T J");
		
		  BCryptPasswordEncoder enco = new BCryptPasswordEncoder(); String pass=
		  enco.encode("jerojone@07"); user.setPassWord(pass);
		 
			
		User savedUser=repo.save(user);
		
		User existUser =entityManager.find(User.class,savedUser.getAltId());
		
		assertThat(existUser.getAltId()).isEqualTo(user.getAltId());
	}
	
	@Test
	public void testFindUserByAltId() {
		String altId="999999";
		User user =repo.findByAltId(altId);
		
		assertThat(user).isNotNull();
	}
	
}
