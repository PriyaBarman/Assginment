package com.overload2;

public class Student {
	private int id;
	private String name;

	private int age;
	private float marks;
     static int count=0; {
    	  count++;
     }
	Student() {

	}
	 Student(int id,String name, int age, float marks){
		   this.id= id;
		   this.name=name;
		   this.age=age;
		   this.marks=marks;
	 }  
	 Student(String address){
		   this(id,name, age);
			 
		  
	 }  
	  public  String toString() {
		   return(" Student Details:"+id+" "+name+" "+age+" "+marks);
	  }

}
