package com.niit.shoppingcart;

import static org.junit.Assert.*;

import java.awt.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.SupplierDAO;

import com.niit.shoppingcart.model.Supplier;


public class TestCaseSupplier {

	
	@Autowired
	SupplierDAO supplierDAO;
	@Autowired
	Supplier supplier;
	
	AnnotationConfigApplicationContext context;
	@Before
	public void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		supplierDAO = (SupplierDAO)context.getBean("supplierDAO");
		supplier = (Supplier)context.getBean("supplier");
	}
/*		@Test
	public void supplierListTestCase()
	{
		List<Supplier> list = supplierDAO.list();
		int rowCount = list.size();
		assertEquals("Supplier List Test Case", rowCount,3);
	}
*/	
	/*@Test
	public void supplierAddTestCase()
	{
		supplier.setId("NOB_005");
		supplier.setName("Nikhi");
		supplier.setAddress("this is abcd");
		boolean flag = supplierDAO.save(supplier);
		assertEquals(flag, true);
	}*/
	/*@Test
	public void deleteTestCase(){
		supplier.setId("NOB_003");
		assertEquals(supplierDAO.delete(supplier),true);
	}*/
	
	@Test
	public void updateTestCase(){
		supplier.setId("NOB_009");
		supplier.setName("Man");
		supplier.setAddress("this is mmdg");
		assertEquals(supplierDAO.update(supplier),true);
	}

	/*@Test
	public void getSupplierTestCase(){
	supplier=supplierDAO.get("NOB_003");
	System.out.println(supplier.getAddress());
	assertEquals(supplier.getName(), "Man");
	}*/
	
	
	
	
	
	

	



}
