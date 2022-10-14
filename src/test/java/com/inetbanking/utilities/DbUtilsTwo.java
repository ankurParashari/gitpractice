package com.inetbanking.utilities;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
public class DbUtilsTwo {

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
		
		String query = "insert into employee(EmpId,FirstName,LastName,EmpAge,EmpDepartment) values (?,?,?,?,?)";
		
		PreparedStatement pstmt = con.prepareStatement(query);
		
		pstmt.setInt(1, 107);
		pstmt.setString(2, "nitin");
		pstmt.setString(3, "mukesh");
		pstmt.setInt(4, 312);
		pstmt.setString(5, "sales");
		
		
		pstmt.setInt(1, 108);
		pstmt.setString(2, "extra");
		pstmt.setString(3, "mukesh");
		pstmt.setInt(4, 310);
		pstmt.setString(5, "marketing");
		
	    
		
		System.out.println("record inserted " );
		
		con.close();

	}

}
