package com.demo;

public class CarTest {

	public static void main(String[] args) {
		
		System.out.println(" Number of  Car sold "+Car.carCount);
		
		Car c1= new Car( " Alto",1);
		System.out.println(c1);
         Car c2= new Car(" Balino",2); 
         System.out.println(c2);
        Car c3= new Car();
        System.out.println(c3);
        Car c4= new Car();
        System.out.println("Number of Cars sold :"+Car.carCount);
        
        
        
	}

}
