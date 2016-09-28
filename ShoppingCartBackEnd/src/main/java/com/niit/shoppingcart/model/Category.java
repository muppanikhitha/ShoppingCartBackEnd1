package com.niit.shoppingcart.model;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Entity
@Table
@Component
public class Category {

	@Id
	private String caty_id;
	@NotEmpty
	private String caty_name;
	@NotEmpty
	private String caty_description;
	
	
	

	public String getCaty_id() {
		return caty_id;
	}

	public void setCaty_id(String caty_id) {
		this.caty_id = caty_id;
	}

	public String getCaty_name() {
		return caty_name;
	}

	public void setCaty_name(String caty_name) {
		this.caty_name = caty_name;
	}

	public String getCaty_description() {
		return caty_description;
	}

	public void setCaty_description(String caty_description) {
		this.caty_description = caty_description;
	}

	

	@OneToMany(fetch=FetchType.EAGER,mappedBy="category")
	private Set<Product> products;
	public Set<Product> getProducts() {
		return products;
	}

	public void SetProducts(Set<Product> products) {
		this.products = products;
	}

	
	

	

}




