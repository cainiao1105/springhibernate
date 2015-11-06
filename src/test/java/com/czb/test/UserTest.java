package com.czb.test;

import java.sql.SQLException;

import org.junit.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

import com.czb.dao.model.UserInfo;
import com.czb.dao.service.UserService;
public class UserTest {
	@Test
	public void saveUserTest() throws SQLException{  
		
	    ApplicationContext context=new ClassPathXmlApplicationContext("/SpringContext.xml");  
	    UserService service =(UserService) context.getBean("userService");  
	      
	   UserInfo user = new UserInfo();  
	   /*  user.setName("T5");
	    user.setTitle("CSDN BLOG5");
	    service.add(user);  */
	 user =  service.find(1);
	  System.out.println(user.getName());
	}  
    
}
