package com.niit.shoppingcart;

import static org.junit.Assert.*;


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
	
	@Test
	public void supplierAddTestCase()
	{
		supplier.setSupe_id("SUP_02");
		supplier.setSupe_name("mouni");
		supplier.setSupe_address("this hyd");
		assertEquals(supplierDAO.save(supplier),true);
	}
	
	
	/*
	@Test
	public void supplierListTestCase()
	{
		List<Supplier> list = supplierDAO.list();
		int rowCount = list.size();
		assertEquals("Supplier List Test Case", rowCount,2);
	}*/
	
	/*@Test
	public void deleteTestCase(){
		supplier.setSupe_id("MOB_002");
		assertEquals(supplierDAO.delete(supplier),true);
	}*/
	
/*	@Test
	public void updateTestCase(){
		supplier.setSupe_id("SUP_001");
		supplier.setSupe_name("Micro");
		supplier.setSupe_address("this is micro");
		assertEquals(supplierDAO.update(supplier),true);
	}*/
/*
	@Test
	public void getSupplierTestCase(){
	supplier=supplierDAO.get("SUP_001");
	System.out.println(supplier.getSup_address());
	assertEquals(supplier.getName(), "Micro technologies");
	}
	*/
	
	
	
	
	

}
