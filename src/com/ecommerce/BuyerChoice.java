package com.ecommerce;

import java.util.Scanner;

public class BuyerChoice {

	public void productDetail(int np) {

		Scanner sc = EStoreShopping.getScanner();

		int noOfProduct = np;

		if (noOfProduct > 0) {
			for (int i = 0; i < noOfProduct; i++) {
				System.out.println("Please Enter Product ID");

				int productID = sc.nextInt();
				System.out.println("Product ID>>" + productID);

				System.out.println("Please Enter Quantity ");

				int quantity = sc.nextInt();

				System.out.println("Quantity>>" + quantity);

			}
			sc.close();

		}

	}
}
