package com.BeeCee.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "signup")
public class SignUp {
	@Id
	@GeneratedValue
	private int id;
	private String first_name;//first_name
	private String last_name;
	private String user_name;
	private String email_id;
	private String password;
	private int contact_number;

	@Override
	public String toString() {
		return "SignUp [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", user_name="
				+ user_name + ", email_id=" + email_id + ", password=" + password + ", contact_number=" + contact_number
				+ "]";
	}

	public String getFirst_name() {
		return first_name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getContact_number() {
		return contact_number;
	}

	public void setContact_number(int contact_number) {
		this.contact_number = contact_number;
	}

	public SignUp(int id, String first_nam, String last_name, String user_name, String email_id, String password,
			int contact_number) {
		super();
		this.id = id;
		this.first_name = first_nam;
		this.last_name = last_name;
		this.user_name = user_name;
		this.email_id = email_id;
		this.password = password;
		this.contact_number = contact_number;
	}
	
	public SignUp() {
		
	}

}
