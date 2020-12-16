package com.xworkz.memorymanagement;

public class toFindVolumeOfSphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		System.out.println("program to find volume of sphere");
		toFindVolumeOfSphere findvol = new toFindVolumeOfSphere();
		double result = findvol.findvolumeofsphere(5);
		System.out.println("Volume :" + result);
		System.out.println("End of the program");

	}

	double findvolumeofsphere(int radius) {
		
		 
		double volume;
		double pi = findpi();
		volume = (4.00 / 3.00) * pi * radius * radius * radius;
		return volume;

	}

	double findpi() {
		double pi = (22d / 7d);
		return pi;	
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


