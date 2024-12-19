package demo.selenium.com;
import java.sql.Connection;  
import java.sql.DriverManager; 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

	public class ExtractQuery {
		 public static void main(String[] args)  throws SQLException, ClassNotFoundException {	
//	    	String dbURL = "jdbc:sqlserver://localhost:1433/";
//			String username = myUserName;
//	        String password = myPassword;
	        
	        String dbURL ="jdbc:sqlserver://localhost:1434;integratedSecurity=true;encrypt=false;trustServerCertificate=true;";
	        //Load MS SQL JDBC Driver
	        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	        //Creating connection to the database
	        Connection con = DriverManager.getConnection(dbURL);
	        //Creating statement object
	    	Statement st = con.createStatement();
	    	String selectquery = "SELECT top(20) * FROM [webus].[dbo].[ANBUDSFORFRAGAN] ";
	        //Executing the SQL Query and store the results in ResultSet
	    	ResultSet rs = st.executeQuery(selectquery);
	    	//While loop to iterate through all data and print results
	    	while (rs.next()) {
	    		System.out.print(rs.getString("id"));
	    		System.out.print(" ");
	    		System.out.print(rs.getString("RUBRIK"));
	    		System.out.println();
	    	}
	        //Closing DB Connection
	    	con.close();
		}
	}