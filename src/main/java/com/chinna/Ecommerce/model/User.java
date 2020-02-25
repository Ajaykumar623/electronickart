package com.chinna.Ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="UserData")
public class User 
{
	@Id
private String userName;
	@Column
private String password;
	@Column
private String email;
	@Column
private String mobileNo;
	
@Column
	private String role;
public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
public void setUserName(String userName) 
{
	this.userName = userName;
}
public String getUserName() 
{
	return userName;
}

public void setPassword(String password) 
{
	this.password = password;
}
public String getPassword() 
{
	return password;
}

public void setEmail(String email) 
{
	this.email = email;
}
public String getEmail() 
{
	return email;
}

public void setMobileNo(String mobileNumber) 
{
	this.mobileNo = mobileNumber;
}
public String getMobileNo() 
{
	return mobileNo;
}
}

