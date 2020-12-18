package com.xworkz.Block;

public class EmployeeTester {

	public static void main(String[] args) {
	 Employee em1 = new Employee();
	 System.out.println("name :" +em1.name);
	 System.out.println("age : " + em1.age);
	 System.out.println("salary : " + em1.salary);
     System.out.println("designation :" +em1.designation);
     
	 System.out.println(" ========================");
      
     Employee em2 = new Employee("smith" ,30, 20000,"senior softwre engineer");
     
     System.out.println("name :" +em2.name);
	 System.out.println("age :" + em2.age);
	 System.out.println("salary : " + em2.salary);
	 System.out.println("designation :" + em2.designation);

}
}