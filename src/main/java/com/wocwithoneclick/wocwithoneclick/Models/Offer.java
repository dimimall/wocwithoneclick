package com.wocwithoneclick.wocwithoneclick.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table(name = "\"Offer\"")
public class Offer {

	@Id
	private long offerId;
	private long userId;
	private String title;
	private String description;
	private String base64Offer;
	private boolean active;
	
	
	public Offer() {
		super();
		
	}


	public Offer(long offerId, long userId, String title, String description, String base64Offer, boolean active) {
		super();
		this.offerId = offerId;
		this.userId = userId;
		this.title = title;
		this.description = description;
		this.base64Offer = base64Offer;
		this.active = active;
	}


	public long getOfferId() {
		return offerId;
	}


	public void setOfferId(long offerId) {
		this.offerId = offerId;
	}

	

	public long getUserId() {
		return userId;
	}


	public void setUserId(long userId) {
		this.userId = userId;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getBase64Offer() {
		return base64Offer;
	}


	public void setBase64Offer(String base64Offer) {
		this.base64Offer = base64Offer;
	}


	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}
	
	
	
}
