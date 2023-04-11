package com.demo;

import java.util.Scanner;

public class Student {
	private int sid;
	private String name;
	private float marks;

	Student() {

	}

	Student(int sid, String name, float marks) {
		this.sid = sid;
		this.name = name;
		this.marks = marks;

	}

	public String toString() {
		return (" Student Details:" + sid + " " + name + "  " + marks);
	}

}
