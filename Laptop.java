package com.xworkz.staticmember;

public class Laptop {

	String brand;
	double cost;
	static String color="black";
	{ //initialization block
		System.out.println("varities of laptop");
	}

	Laptop(String inbrand, double incost) { //constructor
		brand = inbrand;
		cost = incost;
		//color = incolor;
	}
	static void setcolor(String color) {  //static method
		color="black";
	}
	

	void displayDetails() { 
		
		System.out.println("brand:" + brand + "  " + "cost:" + cost + "  " + "color:" + color);
	}

}






























