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

	/*@Test
	public void userDetailsListTestCase()
	{
			List<UserDetails> list = userDetailsDAO.list();
		int rowCount = list.size();
		assertEquals("UserDetails List Test Case", rowCount,2);
	}
	
@Test
	public void userDetailsAddTestCase()
	{
		userDetails.setId("US_003");
		userDetails.setName("NIKHItha");
		userDetails.setPassword(" n30");
		userDetails.setMail("ni30@gmail");
		userDetails.setContact(" 2258345");	
		userDetails.setAddress(" abcdeh");
		
		boolean flag = userDetailsDAO.save(userDetails);
		assertEquals(flag, true);
	
	}
	@Test
	public void deleteTestCase(){
		userDetails.setId("US_001");
		assertEquals(userDetailsDAO.delete(userDetails),true);
	}
	
	*/@Test
	public void updateTestCase(){
		userDetails.setId("US_002");
		userDetails.setName("asu");
		userDetails.setPassword(" asu");
			userDetails.setMail(" susa@gmail.com");
				userDetails.setContact(" 4583");
					userDetails.setAddress(" aaqwr");
		assertEquals(userDetailsDAO.update(userDetails),true);
	}
	
/*	@Test
	public void getUserDetailsTestCase(){
	userDetails=userDetailsDAO.get("US_003");
	System.out.println(userDetails.getAddress());
	assertEquals(userDetails.getName(), "abcdeh");
	}
	
	
	
	
*/
}
