package com.niit.shoppingcart.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.Supplier;
@Repository
public interface SupplierDAO {

	public boolean save(Supplier supplier);

	public boolean update(Supplier supplier);

	public boolean delete(Supplier supplier);

	public Supplier get(String supe_id);

	public List<Supplier> list();

	public Supplier getByName(String supe_name);
}
