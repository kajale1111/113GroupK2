package com.ecommerce;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Guest {
	//public static void main(String[] args) {
			public static void gallery3 () {
										
				Connection con=DBUtil.getCon();
				String query="select * from estorage ";//where age between 15 and 20
				PreparedStatement pst=null;
				ResultSet rs=null;
				try {
					pst=con.prepareStatement(query);
					
					rs=pst.executeQuery();
					System.out.println("Product Gallery>>");
					while(rs.next()) {
						System.out.println("Product Id>>"+rs.getInt(1));
						System.out.println("Product Name>>"+rs.getString(2));
						System.out.println("Product Discription >>"+rs.getString(3));
						System.out.println("Price>>"+rs.getFloat(4));
						System.out.println("Quantity>>"+rs.getInt(5));
						System.out.println();
					}
					
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					if (con != null || pst != null || rs!=null) {
						try {
							rs.close();
							con.close();
							pst.close();
							
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			
		}

			public static void galleryG() {
			gallery3();
				
			}
}
