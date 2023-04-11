package com.demo;

public class Student {
	private int sid;
	private String sname;
	private float marks;

	Student() {

	}

	Student(int sid, String sname) {
     this();
	}

	Student( float marks) {
       this(  sid, sname);
	}

	
}
