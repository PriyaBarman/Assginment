package com.demo;

public class Car {
	private  String carname;
	private int model;
	 static int carCount=0;
	 {
		 // Instense block
		 carCount++;
	 }
	  public Car()
	  {
		  
	  } 
	  public Car( String carname, int model)
	  {
		  this.carname=carname;
		this.model=model;   
	  } 
	  //getter setter
	  public String getCarname()
	  {
		  return carname;
	  }
	  public void setCarname(String carname)
	  {
		this.carname=carname; 
	  }
	   public int getModel( )
	   {
		  return model; 
	   }
	    public void setModel( )
	    {
	    	this.model=1;
	    }
	    
	    public String toString()
	    
	    {
	    	return"Sold  Car : "+carname+" "+model+"";
	    			
	    }
}

