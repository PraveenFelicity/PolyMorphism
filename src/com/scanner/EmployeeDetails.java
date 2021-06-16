package com.scanner;

import java.util.Scanner;

public class EmployeeDetails {
public static void main (String[] args) {
	Scanner sc = new Scanner (System.in);
	int id = sc.nextInt();
	System.out.println("employeID:"+id);
	String st = sc.next();
	System.out.println("emailId:"+ st);
	int id1 = sc.nextInt();
	System.out.println("PhoneNumber:"+ id1);
	float f = sc.nextFloat();
	System.out.println("Salary;"+f);
	String st1 = sc.next();
	System.out.println("gender:"+st1);
	String st2 = sc.next();
	System.out.println("City:"+st2);
	String st3 = sc.next();
	System.out.println("Designation:"+st3);
	String st4 = sc.nextLine();
	System.out.println("Name"+st4);
		}
	}
