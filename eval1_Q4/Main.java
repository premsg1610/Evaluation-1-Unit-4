package com.eval1_Q4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Number of students want to add:");
		int number = input.nextInt();
		
	
		
		for(int i=0; i<number; i++)
		{
			System.out.println("==========");
			
			System.out.println("Enter Roll No.:");
			int roll = input.nextInt();
			
			input.nextLine();
			System.out.println("Enter Student Name");
			String name = input.nextLine();
			
			System.out.println("Enter Marks:");
			int marks = input.nextInt();
			
			Student s1 = new Student(roll,name,marks);
			
			System.out.println("Student Detail: " + (i+1));
			System.out.println("Student Roll Number: " + s1.getRollNumber());
			System.out.println("Student Name: " + s1.getStudentName());
			System.out.println("Student Marks: " + s1.getMarks());
		}
	}
}
