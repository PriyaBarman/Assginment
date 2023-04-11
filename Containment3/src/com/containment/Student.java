package com.containment;

public class Student {
	 private int id;
	 private String name;
	 private  float marks;
	 private String  schoolname;
	 private Course course;
	 
	  public  Student(){
	   super();	  
	  } 
	   public Student(int id, String name, float marks,String schoolname, Course course){
		   super();
		     this.id=id;
		     this.name=name;
		     this.marks=marks;
		     this.schoolname=schoolname;
		     this.course=course;  
	   }
	    // getter settter
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
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public String getSchoolname() {
		return schoolname;
	}
	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	   public  String  toString() {
		   return("Student details:"+id+" "+name+" "+marks+" "+schoolname+" "+course);
	   }  

}
 