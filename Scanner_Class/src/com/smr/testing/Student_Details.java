package com.smr.testing;

import java.util.Scanner;

public class Student_Details {
	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
				
		System.out.println("what is your age");
		byte age = m.nextByte();		
		
		System.out.println("Year of Admission");
		short year = m.nextShort();		
		
		System.out.println("Roll Number");
		int roll = m.nextInt();
				
		System.out.println("Phone number");
		long phone = m.nextLong();		
		
		System.out.println("Indian");
		boolean citizen = m.nextBoolean();
				
		System.out.println("CGPA");
		float cgpa = m.nextFloat();
				
		System.out.println("percentage");
		double percent = m.nextDouble();
		
		System.out.println("my age is :" + age);
		System.out.println("college Admission year :" + year);
		System.out.println("My college roll number :" + roll);
		System.out.println("My phone Number is :" + phone);
		System.out.println("citizen of India : " +citizen);
		System.out.println("CGPA :" + cgpa);
		System.out.println("Percentage :" + percent);
		
		
		
	}

}
