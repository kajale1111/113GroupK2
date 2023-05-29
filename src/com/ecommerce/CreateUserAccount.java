package com.ecommerce;

import java.util.Scanner;

public class CreateUserAccount {

	@SuppressWarnings("unused")
	public void userRegistration() {
      
		System.out.println("Please Fill The Below Information to Create New Account");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first name>>");
		String firstName=sc.next();
		
		System.out.println("Enter the last name>>");
		String lastName=sc.next();
		
		
		System.out.println("Enter the username>>");	
		String userName=sc.next();
		
		System.out.println("Enter the password>>" + "Minimum 8 Character>>");
		int password=sc.nextInt();
		
		System.out.println("Enter the city>>");
		String city=sc.next();
		
		System.out.println("Enter the mail id>>");
		String mailID=sc.next();	
		
		System.out.println("Enter the mobile number>>");
		String mobileNumber=sc.next();
		
		System.out.println("Registration Complete");
		
		sc.close();
		
        
	}
}


