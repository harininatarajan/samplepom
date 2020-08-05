package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class Learndatabasetesting {
	
	
@Test
public void connectDataBase() throws ClassNotFoundException, SQLException {
	
	
 final String dbdriver="com.mysql.jdbc.Driver";
 // new driver:com.mysql.cj.jdbc.Driver
 final String DBURL="jdbc:mysql://localhost:3306/selenium ";
 final String username="root";
 final String Password="harininatarajan";
 
 Connection con =null;
 Statement stmt =null;
 
 //Initialize the driver
 
 Class.forName(dbdriver);
 
 //Establish the Connection
 
 con = DriverManager.getConnection(DBURL, username, Password);

 //Create SQL Statement
 
 stmt = con.createStatement();
 
 String sql ="select * from empdetails";
 ResultSet rs = stmt.executeQuery(sql);
 
 while (rs.next()) {
	 String empId = rs.getString("empid");
	 System.out.println("The Employee details are:" +empId);
	 int Phoneno = rs.getInt("phone");
	 System.out.println("The Phone no is:" +Phoneno);
 }	
}

}
