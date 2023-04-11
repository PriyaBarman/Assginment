package com.demo2;

public class PersonTest {
	public static void main(String[] args) {
		Address a1 = new Address(1, "Bhopal");
		Person p1= new Person("Priya","F",32,a1);
		System.out.println(p1);
	}
}