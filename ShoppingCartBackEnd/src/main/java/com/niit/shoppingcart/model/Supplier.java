package com.niit.shoppingcart.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="supplier")
@Component
public class Supplier {
	
	@Id
	private String supe_id;
	private String supe_name;
	private String supe_address;
	
	@OneToMany(mappedBy = "supplier", fetch=FetchType.EAGER)
	private Set<Product> products;
	
	public Set<Product> getProducts() {
		return products;
	}
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
	public String getSupe_id() {
		return supe_id;
	}
	public void setSupe_id(String supe_id) {
		this.supe_id = supe_id;
	}
	public String getSupe_name() {
		return supe_name;
	}
	public void setSupe_name(String supe_name) {
		this.supe_name = supe_name;
	}
	public String getSupe_address() {
		return supe_address;
	}
	public void setSupe_address(String supe_address) {
		this.supe_address = supe_address;
	}
	
	
}
