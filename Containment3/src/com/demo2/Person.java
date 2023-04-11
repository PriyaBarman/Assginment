package com.demo2;

public class Person {
	 private String Name;
	  private  String Gender;
	  private int age;
	  private  Address address;
	   
	    public Person() {
	    	super();
	    }
	public Person(String name, String gender, int age, Address address) {
		super();
		this.Name = name;
		 this.Gender = gender;
		this.age = age;
		 this.address=address;
		
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person Details : " + Name + " " + Gender + " " + age + " " + address ;
	}
	
	  
	 

}
