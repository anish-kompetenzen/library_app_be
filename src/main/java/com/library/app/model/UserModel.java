package com.library.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_details")
public class UserModel {
	@Id // Primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
	private Integer id;
	private String name, email, password, utype;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getUtype() {
		return utype;
	}

	public void setUtype(String utype) {
		this.utype = utype;
	}

	@Override
	public String toString() {
		return "UserModel [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", utype="
				+ utype + "]";
	}

	public UserModel(Integer id, String name, String email, String password, String utype) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.utype = utype;
	}

	public UserModel() {
	}
}
