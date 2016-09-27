package com.niit.shoppingcart;

import static org.junit.Assert.*;





import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.UserDetailsDAO;
import com.niit.shoppingcart.model.UserDetails;

public class TestCaseUserDetails {

	@Autowired
	UserDetailsDAO userDetailsDAO;
	@Autowired
	UserDetails userDetails;
	
	AnnotationConfigApplicationContext context;
	
	@Before
	public void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		userDetailsDAO = (UserDetailsDAO)context.getBean("userDetailsDAO");
		userDetails = (UserDetails)context.getBean("userDetails");
	}
	
	@Test
	public void userDetailsAddTestCase()
	{
		userDetails.setId("use_03");
		userDetails.setName("nikhitha");
		userDetails.setPassword("ammulu");
		userDetails.setMail("ammulu@com");
		userDetails.setContact("7337528485");
		userDetails.setAddress("ongole");
	
		assertEquals(userDetailsDAO.save(userDetails),true);
	}
	
	
	/*
	@Test
	public void userDetailsListTestCase()
	{
		List<UserDetails> list = userDetailsDAO.list();
		int rowCount = list.size();
		assertEquals("UserDetails List Test Case", rowCount,2);
	}*/
	
	/*@Test
	public void deleteTestCase(){
		userDetails.setId("MOB_002");
		assertEquals(userDetailsDAO.delete(userDetails),true);
	}*/
	
	@Test
	public void updateTestCase(){
		userDetails.setId("use_01");
		userDetails.setName("nikhitha");
		userDetails.setPassword("nikhi");
		userDetails.setMail("nikhi.com");
		userDetails.setContact("90275857");
		userDetails.setAddress("madinaguda");
		assertEquals(userDetailsDAO.update(userDetails),true);
	}

	/*@Test
	public void getUserDetailsTestCase(){
	userDetails=userDetailsDAO.get("us_001");
	System.out.println(userDetails.getAddress());
	System.out.println(userDetails.getMail());
	assertEquals(userDetails.getName(), "Roope");
	}
	*/
	
	
	
	
	

}
