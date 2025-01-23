package com.wocwithoneclick.wocwithoneclick.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "\"Product\"")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long productId;
	private long categoryId;
	private long userId;
	private String title;
	private String subTitle;
	private String[] base64Image = new String[5];
	private double price;
	private String description;
	private boolean active;
	
	public Product() {
		super();
	}
	
	
	public Product(long productId, long categoryId, long userId, String title, String subTitle, String[] base64Image, double price, String description,
			boolean active) {
		super();
		this.productId = productId;
		this.categoryId = categoryId;
		this.userId = userId;
		this.title = title;
		this.subTitle = subTitle;
		this.base64Image = base64Image;
		this.price = price;
		this.description = description;
		this.active = active;
	}


	public long getProductId() {
		return productId;
	}


	public void setProductId(long productId) {
		this.productId = productId;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getSubTitle() {
		return subTitle;
	}


	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}


	public String[] getBase64Image() {
		return base64Image;
	}


	public void setBase64Image(String[] base64Image) {
		this.base64Image = base64Image;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}


	public long getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}


	public long getUserId() {
		return userId;
	}


	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	
	
}
