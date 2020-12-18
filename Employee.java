package com.xworkz.Block;

public class Employee {
            String name;
            int  age;
            double salary;
            String designation;
            {
                System.out.println(" Initialization block 1");	
                name = "ram";
                
            }   
            Employee(){
            	System.out.println("No arg constructor");
            }
           
            {
            System.out.println("Initialization block 2");
             age = 25;
            }
            {
            	System.out.println("Initialization block 4");
            	salary = 10000;
            }
            Employee(String inname, int inage,double insalary,String indesignation) {
            	      name = inname;
            	      age = inage;
            	      salary = insalary;
                      String designation = indesignation;
            } 

            
            {
            	System.out.println("Initialization block 4");
            	salary = 10000;
            }
            {
            System.out.println("Initialization block 3");
            designation = "software engineer";
            }
            
}            

