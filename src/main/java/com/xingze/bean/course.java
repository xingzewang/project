package com.xingze.bean;

public class course {
    private String course_id;
    private String course_name;
    private String teacher_id;
	
    public String getCourse_id() {
		return course_id;
	}
	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public String getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(String teacher_id) {
		this.teacher_id = teacher_id;
	}
	
	public course() {}
	
	public course(String course_id, String course_name, String teacher_id) {
		super();
		this.course_id = course_id;
		this.course_name = course_name;
		this.teacher_id = teacher_id;
	} 
}
