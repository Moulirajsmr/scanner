package com.smr.testing;

import java.util.Scanner;

public class Personal_Details {
	
	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = m.nextLine();
				
		System.out.println("what is your birth date?");
		String dob = m.nextLine();
				
		System.out.println("What is your Father name?");
		String father = m.nextLine();
				
		System.out.println("What is your mother name?");
		String mother = m.nextLine();
				
		System.out.println("What is your current city?");
		String city = m.nextLine();
		
		
		System.out.println("My name is : " + name);
		System.out.println("Date of birth : " + dob);
		System.out.println("Father name : " + father);
		System.out.println("Mother name : " + mother);
		System.out.println("Current city : " + city);
	}

}
