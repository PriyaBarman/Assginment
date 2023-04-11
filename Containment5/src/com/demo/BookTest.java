package com.demo;

public class BookTest {
	public static void main(String args[]) {
		Author a1 = new Author(11, "Babu Boshai", "12 Jan 1956");
		Author a2 = new Author(22, "R.R. Rohini");

		Book b1 = new Book(222, "Special Ops", 788, "Intelligence", a1);
		Book b2 = new Book(323, "The secret ceremony", 999, a2);
		Author sc =  new Author(4,"priya");
	     a1.setName(sc.next());
		
		
		System.out.println("=================");
		System.out.println(a1);
		System.out.println("Number of Authors: " +Author.authorCount);

	}

}