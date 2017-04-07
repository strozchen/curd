package com.stroz.entity;

import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class User {
	private Integer id;
	private String userName;
	private String password;
	private Date birthday;
	private String mail;
	private String userRole;
	public User(Integer id,String userName, String password, Date birthday, String mail, String role) {
		this.id=id;
		this.userName = userName;
		this.password = password;
		this.birthday = birthday;
		this.mail = mail;
	}
	public User() {
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole=userRole;
	}

	
	
}
