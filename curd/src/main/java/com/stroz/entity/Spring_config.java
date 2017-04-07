package com.stroz.entity;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;
import org.springframework.web.servlet.handler.UserRoleAuthorizationInterceptor;

import com.stroz.DAO.UserDAO;
import com.stroz.aspectJ.AspectAction;

//@Configuration
//@EnableAspectJAutoProxy(proxyTargetClass=true)
//@Import(AspectAction.class)
public class Spring_config {
	
//	@Bean
//	@Scope(value="singleton")
	public UserDAO getUserDAO(){
		UserDAO userDao=new UserDAO();
		return userDao;
	}
	
//	@Bean
//	@Scope(value="prototype")
	public User getUser(){
		return new User();
	}
	
	

}
