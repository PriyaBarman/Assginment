package com.demo;

public class Anonymous {

	public static void main(String[] args) {

		Employee e1 = new Employee(101, "Bhushan", 89000f, new Department(101, "HR", "Delhi"));
		Employee e2 = new Employee(102, "Sneha", 7800f, new Department(101, "HR", "Mumbai"));

		System.out.println(e1);
		System.out.println(e2);

	}

}
