package com.niit.shoppingcart.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;


import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table
@Component
public class Product {

	@Id
	private String prt_id;
	private String prt_name;
	private String prt_description;
	private String prt_price;
	private String catey_id;
		private String suppr_id;
		@Transient
		private MultipartFile image;
		
	public MultipartFile getImage() {
			return image;
		}
		public void setImage(MultipartFile image) {
			this.image = image;
		}
	@ManyToOne
	@JoinColumn(name="catey_id" ,updatable=false,insertable=false,nullable=false)
	private Category category;
	
	
	@ManyToOne
	@JoinColumn(name="suppr_id", updatable=false,insertable=false,nullable=false)
	private Supplier supplier;
	
		 public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	

	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getPrt_id() {
		return prt_id;
	}
	public void setPrt_id(String prt_id) {
		this.prt_id = prt_id;
	}
	public String getPrt_name() {
		return prt_name;
	}
	public void setPrt_name(String prt_name) {
		this.prt_name = prt_name;
	}
	public String getPrt_description() {
		return prt_description;
	}
	public void setPrt_description(String prt_description) {
		this.prt_description = prt_description;
	}
	public String getPrt_price() {
		return prt_price;
	}
	public void setPrt_price(String prt_price) {
		this.prt_price = prt_price;
	}
	public String getCatey_id() {
		return catey_id;
	}
	public void setCatey_id(String catey_id) {
		this.catey_id = catey_id;
	}
	public String getSuppr_id() {
		return suppr_id;
	}
	public void setSuppr_id(String suppr_id) {
		this.suppr_id = suppr_id;
	}
	
	

}
