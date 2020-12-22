package com.xworkz.staticmember;

public class LaptopTester {

	public static void main(String[] args) {
		Laptop dell = new Laptop("dell", 20.0);
		dell.displayDetails(); // calling object
		Laptop.setcolor("grey"); // calling static method
		Laptop hp = new Laptop("hp", 28.0);
		hp.displayDetails();
        Laptop lenovo = new Laptop("lenovo",40.0);
	    lenovo.displayDetails();
	
	}

}




//Output//
//varities of laptop
//brand : dell cost:20.0 color:black
//variteis of laptop
//brand = hp cost= 30.0 color:black
//varities of laptop
//brand:lenovo cost:40.0 color:black		 