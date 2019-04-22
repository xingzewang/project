package com.xingze.bean;

public class studentCourse {
    private String student_id;
    private String course_id;
    private int score;
     
	public String getStudent_id() {
		return student_id;
	}
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}
	public String getCourse_id() {
		return course_id;
	}
	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public studentCourse() {}
	
	public studentCourse(String student_id, String course_id, int score) {
		super();
		this.student_id = student_id;
		this.course_id = course_id;
		this.score = score;
	}
}
