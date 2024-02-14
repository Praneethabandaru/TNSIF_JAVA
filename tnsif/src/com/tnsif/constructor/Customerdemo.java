package com.tnsif.constructor;

import java.util.Scanner;

public class Customerdemo {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter the name ");
		String name =s.nextLine();
		System.out.println("Enter the address");
		String address=s.nextLine();
		System.out.println("Enter the id");
		int id=s.nextInt();
		Customer c1= new Customer();
		c1.setAddress(address);
		c1.setCid(id);
		c1.setName(name);
		System.out.println(c1);
		
		System.out.println(c1 instanceof Customer);
		
		
	}
	
	


}