package com.wocwithoneclick.wocwithoneclick.Models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "\"User\"")
public class User {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userId",nullable = false)
    private long userId;
	@Column(name = "firstname",nullable = true)
	private String firstname;
	@Column(name = "lastname",nullable = true)
	private String lastname;
	@Column(name = "email",nullable = false)
	private String email;
	@Column(name = "password",nullable = false)
	private String password;
	@Column(name = "base64Image",length = 2048,nullable = true)
	private String base64Image;
	@Column(name = "address",nullable = true)
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