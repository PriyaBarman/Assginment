package com.demo2;

public class Address {

	private int id;
	private String name;

	public Address() {
		super();

	}

	public Address(int id, String name) {
		super();
		this.id = id;
		this.name = name;

	}

	public int getid() {
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

	public String toString() {
		return "Address" + " " + id + "  " + name;
	}

}
