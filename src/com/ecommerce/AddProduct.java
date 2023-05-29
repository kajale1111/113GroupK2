package com.ecommerce;


	
	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;
    import java.util.Scanner;
	
	public class AddProduct {
	
			//public static void main(String[] args) throws SQLException, ClassNotFoundException {
				
		public static void add() throws SQLException {
				Connection con=DBUtil.getCon();
				String query="insert into estorage values (?,?,?,?,?)";
				PreparedStatement pst=con.prepareStatement(query);
				System.out.println("How many records you want to insert?");
				Scanner sc = new Scanner(System.in);
				int noOfRecords=sc.nextInt();
				if(noOfRecords >0) {
				for(int i=0; i<noOfRecords ;i++) {
					System.out.println("Product ID>>");
					int id=sc.nextInt();
					System.out.println("Product Name>>");
					String name= sc.next();
					System.out.println("Product Discription>>");
					String discription = sc.next();
					System.out.println("Price>>");
					String price = sc.next();
					System.out.println("Quantity>>");
					int quantity = sc.nextInt();
					
					pst.setInt(1, id);
					pst.setString(2, name);
					pst.setString(3, discription);
					pst.setString(4, price);
					pst.setInt(5, quantity);
					
					pst.executeUpdate();
					
				
				}
				sc.close();
				System.out.println("Data inserted successfully.");
				}else {
					System.out.println("Enter positive value");
				}
				pst.close();
				con.close();
				sc.close();
			}

		

		}

	

	