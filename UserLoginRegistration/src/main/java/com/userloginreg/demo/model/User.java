package com.userloginreg.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="MYUSER")
public class User {
	
	@Id
	private int id;
	private String uName;
	private String fName;
	private String lName;
	private int age;
	private String password;
	
	public User() {
		
	}
	public User(String uName, String fName, String lName, int age, String password) {
		super();
		this.uName = uName;
		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", uName=" + uName + ", fName=" + fName + ", lName=" + lName + ", age=" + age
				+ ", password=" + password + "]";
	}
	
	
}
