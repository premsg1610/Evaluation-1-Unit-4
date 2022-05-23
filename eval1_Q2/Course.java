package com.eval1_Q2;

import java.util.Scanner;

public class Course {

	int courseId;
	String courseName;
	int courseFee;
	
	public void displayCourseDetails() {
		
		System.out.println("Course Id is: " + courseId);
		System.out.println("Course Name is: " + courseName );
		System.out.println("Course Fee is: " + courseFee);
	}
	
	public static void authenticate(String username, String password) {
		
		if(username.equals("Admin") && password.equals("1234"))
		{
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter course id:");
			int id = input.nextInt();
			
			input.nextLine();
			System.out.println("Enter course name:");
			String name = input.nextLine();
			
			System.out.println("Enter course fee:");
			int fee = input.nextInt();
			
			Course c1 = new Course();
			c1.courseId = id;
			c1.courseName = name;
			c1.courseFee = fee;
			
			c1.displayCourseDetails();
			
		}
		else {
			System.out.println("Invalid Username or password");
		}
	}
	
	public static void main(String[] args) {
		
		Course.authenticate("Admin", "1234");
		Course.authenticate("Prem", "1107");
		
	}
}
