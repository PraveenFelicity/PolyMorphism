package com.methodloading.box;

public class Employee {

   public void empDetails (int id) {
	   System.out.println(id);
   }
   public void empDetails (String name) {
	   System.out.println(name);
   }
	public void empDetails (String email, Long ph) {
		System.out.println(email);
		System.out.println(ph);
	}
	public void empDetails (Long ph, String address) {
		System.out.println(ph);
		System.out.println(address);
	}
	public void empDetails (Float salary, String name) {
		System.out.println(salary);
		System.out.println(name);
	}
	
	public static void main (String[] args) {
		Employee e = new Employee ();
		e.empDetails(789578);
		e.empDetails(15785.25f, "Kiruthika");
		e.empDetails(124584l, "Salem");		
			}
}
