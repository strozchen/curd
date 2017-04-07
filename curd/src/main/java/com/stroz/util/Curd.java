package com.stroz.util;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.stroz.DAO.UserDAO;
import com.stroz.entity.User;

@Controller
@RequestMapping("curd")
public class Curd {
	@Autowired
	private ResourceBundleMessageSource messageSource;
//	private static final AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(Spring_config.class);
	
	@RequestMapping(value="/userlist")
	public String userList(){
//		UserDAO userdao=ctx.getBean(UserDAO.class);
		UserDAO userdao=new UserDAO();				
		userdao.init();		
		System.out.println(userdao.getCount());
		return "view/userList";
	}
	
	@RequestMapping(value="/userread")
	public String userread(){
//		UserDAO userdao=ctx.getBean(UserDAO.class);
		UserDAO userdao=new UserDAO();	
		System.out.println(userdao.hashCode());
		return "view/userList";
	}
	
	@ResponseBody
	@RequestMapping("/json")
	public List<User> jsonTest(){
//		UserDAO userdao=ctx.getBean(UserDAO.class);	
		UserDAO userdao=new UserDAO();	
		userdao.init();
		return userdao.getAll();
	}
	@RequestMapping("/i18n")
	public String i18n(Locale locale){
		String val=messageSource.getMessage("i18n.userName", null, locale);
		System.out.println(val);
		return "index";
	}
}
