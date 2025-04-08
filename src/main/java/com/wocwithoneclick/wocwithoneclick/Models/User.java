package com.wocwithoneclick.wocwithoneclick.Models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table(name = "\"User\"")
public class User {
	
	@Id
	@Column(value = "userId")
	@NotNull
    private long userId;
	@Column(value = "firstname")
	@Null
	private String firstname;
	@Column(value = "lastname")
	@Null
	private String lastname;
	@Column(value = "email")
	@NotNull
	private String email;
	@Column(value = "password")
	@NotNull
	private String password;
	@Column(value = "base64Image")
	@Null
	private String base64Image;
	@Column(value = "address")
	@Null
	private String address;
	
	
	public User() {
		super();
	}
	
	public User(String firstname, String lastname, String email, String password, String base64Image,
			String address) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.base64Image = base64Image;
		this.address = address;
	}
	
	public User(long userId, String firstname, String lastname, String email, String password, String base64Image,
			String address) {
		super();
		this.userId = userId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.base64Image = base64Image;
		this.address = address;
	}
	
	public long getId() {
		return userId;
	}
	public void setId(long userId) {
		this.userId = userId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getBase64Image() {
		return base64Image;
	}
	public void setBase64Image(String base64Image) {
		this.base64Image = base64Image;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}