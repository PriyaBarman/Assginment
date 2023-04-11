package com.containment;

public class Course {
	private int cid;
	private String cname;
	private float cprice;

	public Course() {

	}

	public Course(int cid, String cname, float cprice) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cprice = cprice;

	}

	// gettter settter
	public int getCid() {
		return cid;
	} 
	public void setCid( int cid) {
		this.cid=cid;
	}

	 public String getCname() {
		  return cname;
	 }
	  public void setCname(String cname) {
		  this.cname=cname;
	  }
	   public float getCprice() {
		   return cprice;
	   }
	   public void setCprice( float cprice) {
		   this.cprice=cprice;
	   }  
	   public  String toString() {
		   return("Course Details:"+cid+" " +cname+ " "+cprice); 
	   }
	   
}
