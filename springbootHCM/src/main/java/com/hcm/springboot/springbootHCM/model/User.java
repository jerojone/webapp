package com.hcm.springboot.springbootHCM.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
		
	public User() {
		
	}
	
	public User(String altId, String fName, String lName, String passWord, boolean enabled) {
		this.altId = altId;
		this.fName = fName;
		this.lName = lName;
		this.passWord = passWord;
		this.enabled = enabled;
	}
	
	@Id
	@Column(name = "altid")
	private String altId;
	@Column(name = "firstname", nullable = false)
	private String fName;
	@Column(name = "lastname",nullable = false)
	private String lName;
	@Column(name = "password",nullable = false)
	private String passWord;
	@Column(name = "status",nullable = false)
	private boolean enabled;
	
	public String getAltId() {
		return altId;
	}
	public void setAltId(String altId) {
		this.altId = altId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	@Override
	public String toString() {
		return "User [altId=" + altId + ", fName=" + fName + ", lName=" + lName + ", passWord=" + passWord
				+ ", enabled=" + enabled + "]";
	}
	

}
