package curdtest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.stroz.DAO.UserDAO;
import com.stroz.entity.Spring_config;
import com.stroz.entity.User;

public class test1 {

	@Test
	public void test() {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("classpath:Curd.xml");
		UserDAO userdao=ctx.getBean(UserDAO.class);
		userdao.init();
		User user=userdao.read(new Integer(1));
		System.out.println(user.getUserName());
//		System.out.println(userdao.read(1));
//		System.out.println(userdao.getCount());
	}

}
