package com.carrot.react.domain;

import java.sql.Date;

public class User {
	String user_id;
	String password;
	String name;
	String age;
	String email;
	String phone;
	String address;
	Date reg_date;
	
	public User() {
		super();
	}
	public User(String user_id, String password, String name, String age, String email, String phone, String address,
			Date reg_date) {
		super();
		this.user_id = user_id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.reg_date = reg_date;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_password() {
		return password;
	}
	public void setUser_password(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
}
