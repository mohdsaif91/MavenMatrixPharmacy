package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class hank {

	@Id
	int id;
	String name;
	String lname;
	@Override
	public String toString() {
		return "hank [id=" + id + ", name=" + name + ", lname=" + lname + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}

}
