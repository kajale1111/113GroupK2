package com.ecommerce;

import java.util.Scanner;

public class EStoreShopping {

	static Scanner sc;
	

	static {
		System.out.println("### Welcome To EShop ### ");
		sc = new Scanner(System.in);
	}

	static public Scanner getScanner() {
		
			return sc;
		
	}

	public static void main(String[] args) {
		System.out.println("A.New User");
		System.out.println("B.Existing User");
		System.out.println("C.Admin");
		System.out.println("D.Guest");
		System.out.println("E.Exit");

		System.out.println("Please Choose your option");

		Scanner sc = EStoreShopping.getScanner();

		String userinput = sc.next();

		String choice = userinput;

		switch (choice) {
		case "A": // New User
			CreateUserAccount cua = new CreateUserAccount();
			cua.userRegistration();
			System.out.println("Please Choose your option");
			break;

		case "B": // Existing User
			ProductGallery.gallery();
			break;

		case "C": // Admin
			AdminOption ao = new AdminOption();
			ao.admin();
			break;

		case "D": // Guest
			Guest.galleryG();
			break;

		case "E": // Exit
			System.out.println(" Thanks For Visiting To EShop " + "  Have a Nice Day  ");
			break;

		default:
			System.out.println("Invalid input please enter Right choice ");
			break;

		}
		sc.close();
	}

}
