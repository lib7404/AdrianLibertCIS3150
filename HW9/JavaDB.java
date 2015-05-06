//HW 9 Question
//Created by Adrian Libert Id# 153356160


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JavaDB{

	public static Connection connect = null;
	public static Statement statement = null;
	public static ResultSet resultSet = null;


	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//Setup the connection with the db
			connect = DriverManager.getConnection("jdbc:mysql://db/fi_bonds","USER","PASSWORD");
			//Statement Creation
			statement = connect.createStatement();

			//Get the resultset
			resultSet = statement.executeQuery("select * from file_data limit 20");


			//Output the results of the query


			
			while(resultSet.next()) {
				String idportfolio_owner = resultSet.getString("idportfolio_owner");
				String clientFileName = resultSet.getString("clientFileName");
				String currentWorksheet = resultSet.getString("currentWorksheet");
				int rowNumber = resultSet.getInt("rowNumber");
				int colNumber = resultSet.getInt("colNumber");
				String columnDataType = resultSet.getString("columnDataType"); 
				String cellValue = resultSet.getString("cellValue");
				String deis = resultSet.getString("deis");


				//Format for display
				System.out.print("Porfolio Owner: " + idportfolio_owner);
			        System.out.print(" Client File Name: " + clientFileName);
				System.out.print(" Worksheet: " + currentWorksheet);
				System.out.print(" Row: " + rowNumber);
			        System.out.print(" Column: " + colNumber);
			        System.out.print(" Data Type: " + columnDataType);
			        System.out.print(" Cell Value: " + cellValue);
			        System.out.print(" Date in System: " + deis);
				System.out.println();

			}







		} 
		catch (ClassNotFoundException ex) {System.err.println(ex.getMessage());}
    		catch (SQLException ex)           {System.err.println(ex.getMessage());}
		catch (Exception ex) 		  {System.err.println(ex.getMessage());}
		
		


	}





}
