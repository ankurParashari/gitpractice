package com.inetbanking.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class DbUtils {

	public static void main(String[] args) throws IOException, SQLException {
		
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//dbconfig.properties");
		
		Properties dbProperties =new Properties();
		dbProperties.load(fis);
		
		String ankDbCOnnectionName = dbProperties.getProperty("ankurdbConnection");
		String ankdbusername = dbProperties.getProperty("ankukrdbUsername");
		String ankdbpassword = dbProperties.getProperty("ankukrdbPassword");
		
		System.out.println("user name of the connection  "+ ankdbusername);
		
		
		Connection con = DriverManager.getConnection(ankDbCOnnectionName,ankdbusername,ankdbpassword);
		if(con.isClosed()){
			
			System.out.println("connection is closed");
			
		}else{
			
			System.out.println("Connection Established");
			
		}
		
		Statement statement = con.createStatement();
		String query = "select * from employee"; 
		ResultSet resultSet = statement.executeQuery(query);
		ResultSetMetaData rsmd = resultSet.getMetaData();
		// System.out.println("column count in employee table is  " +rsmd.getColumnCount());    // count = 5
		// System.out.println(rsmd.getCatalogName(1));                                          // ankurdb
		// System.out.println(rsmd.getColumnTypeName(1));                                          // Int
		System.out.println(rsmd.getColumnLabel(1)+ "  "+rsmd.getColumnLabel(2) );              // prints the column name
		
		
		while (resultSet.next()) {
			
			int eid = resultSet.getInt("EmpId");
			String fname = resultSet.getString("FirstName");
			System.out.println(eid + "    "+fname);
			
		}
		
		System.out.println("=======let's print the columns name in the table-employee=======");
		 
		for (int i=1; i<=rsmd.getColumnCount();i++){
			
			System.out.print(rsmd.getColumnLabel(i)+" ");
		}
		System.out.println();
		
		
		con.close();
		
		if(con.isClosed()){
			
			System.out.println("Connection closed now");
		}else{
			
			System.out.println("Connection still open");
		}

	}

}




/*DriverManager - Class 
 * 
 * Connection Interface-
 * Statement interface- 
 * PreparedStatement interface - reduces the number of compilation-
 * CallableStatement Interface- useful in order to call Stored Procedures.
 * 
 * */
