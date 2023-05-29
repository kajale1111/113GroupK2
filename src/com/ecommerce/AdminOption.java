package com.ecommerce;

import java.sql.SQLException;
import java.util.Scanner;

public class AdminOption {
	
	//public static void main(String[]args) throws SQLException {
	    @SuppressWarnings("unused")
		void admin1() throws SQLException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter username");
		String username=sc.next();
		System.out.println("Please Enter Password");
		@SuppressWarnings("unused")
		int password=sc.nextInt();
		
		System.out.println("Please Choose your option");
		System.out.println("A.Add product in Gallery");
		System.out.println("B.Check estorage database");
		System.out.println("C.Check User Data");
		System.out.println("D.Check User History");
		
        String admininput=sc.next();
		
	    String choice  =admininput;
		
		switch(choice ) {
		case "A" :// AddProduct ap=new AddProduct();
		          // ap.add();
		       	   AddProduct.add();
			       break;
		         
		case "B" ://Check estorage database
			      Guest.galleryG();
			      break;
		           
		case "C" ://check user Data
	               break;
		          
		case "D" ://check user History
                   break;
                  
		default : System.out.println("Invalid input please enter Right choice ");
	               break;
		
		
		
}    
		sc.close();
}

		public void admin() {
			
			try {
				admin1();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}}