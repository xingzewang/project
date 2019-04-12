package com.xingze.bean;

public class teacher {
     String id;
     String name;
     String telphone;
     String password;
	public String getTelphone() {
		return telphone;
	}
	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public teacher() {}
	
	public teacher(String id, String name, String telphone, String password) {
		super();
		this.id = id;
		this.name = name;
		this.telphone = telphone;
		this.password = password;
	}
}
