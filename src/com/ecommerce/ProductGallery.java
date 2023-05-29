package com.ecommerce;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ProductGallery {

	public static void gallery1() {
		
		Scanner sc = EStoreShopping.getScanner();

		System.out.println("Please Enter your username");

		String username = sc.nextLine();

		System.out.println("Please Enter your =Password");
		String password = sc.nextLine();

		Connection con = DBUtil.getCon();
		String query = "select * from estorage ";// where age between 15 and 20

		PreparedStatement pst = null;

		ResultSet rs = null;

		try {
			pst = con.prepareStatement(query);

			rs = pst.executeQuery();
			System.out.println("Product Gallery>>");
			while (rs.next()) {
				System.out.println("Product Id>>" + rs.getInt(1));
				System.out.println("Product Name>>" + rs.getString(2));
				System.out.println("Product Discription >>" + rs.getString(3));
				System.out.println("Price>>" + rs.getFloat(4));
				System.out.println("Quantity>>" + rs.getInt(5));
				System.out.println();

			}
			System.out.println("Please Enter your choice to buy product");
			int n = sc.nextInt();

			BuyerChoice bc = new BuyerChoice();
			bc.productDetail(n);
			System.out.println("Number of scanners : "+EStoreShopping.count);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally block");
			if (con != null || pst != null || rs != null) {
				try {
					rs.close();
					con.close();
					pst.close();
					// sc.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public static void gallery() {
		gallery1();

	}

}
