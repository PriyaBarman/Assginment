package com.overload2;

public class StundentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1, "Priya", 32, 56f);
		Student s2 = new Student(2, "Ankita", 23, 77f);
		System.out.println(s1);
		System.out.println(s2);

		System.out.println("Number of Student:"+Student.count);

	}

}
