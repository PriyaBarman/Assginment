package com.overload;

public class Student {

	private int sid;
	private String sname;
	private int sage;

	Student() {
		System.out.println(" Im Default");
	}

	Student(int sid, String sname) {
		this.sid = sid;
		this.sname = sname;

	}

	Student(int sid, String sname, int sage) {
		this(sid, sname);

		this.sage = sage;

	}

	void show() {
		System.out.println(sid + " " + sname + " " + sage);

	}

	public String toString() {
		return ("Student Details:" + sid + " " + sname + " " + sage);

	}
}
