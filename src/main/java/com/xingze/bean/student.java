package com.xingze.bean;

public class student{
	private String student_id;
	private String student_name;
	private String sex;
	private String telphone;
	private String  password;
    
	public String getStudent_id() {
		return student_id;
	}
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
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
   
	public  student() {}
	
	public student(String student_id, String student_name, String sex, String telphone, String password) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.sex = sex;
		this.telphone = telphone;
		this.password = password;
	}
	
}
