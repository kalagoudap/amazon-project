package com.amazon.amazonproject.ModelPack;

import org.springframework.stereotype.Component;

@Component
public class loginclass 
{

	private String username;
	private String password;
	private String submit;
	
	public String getSubmit() {
		return submit;
	}
	public void setSubmit(String submit) {
		this.submit = submit;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


}
