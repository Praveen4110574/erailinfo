package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLDemo {
	public void database() {
		//jdbc driver name and database URL
		final String JDBC_DRIVER="com.mysql.jdbc.Driver";
		final String DB_URL="jdbc:mysql://13.233.35.41:3306/opentaps";
		
		//Database credentials
		final String username="dbuser";
		final String password="test@123";
		
		Connection conn=null;
		Statement stmt=null;
		
		//Register JDBC driver
		try {
			Class.forName(JDBC_DRIVER);
			
			//open a connection
			try {
				conn = DriverManager.getConnection(DB_URL, username, password);
				//Execute a statement
				stmt = conn.createStatement();
				String sql="SELECT FIRST_NAME,LAST_NAME FROM OPNTAPS.PERSON WHERE PARTY_ID=10001";
				ResultSet executeQuery = stmt.executeQuery(sql);
				
				//Extract data from resultset
				while (executeQuery.next()) {
					String fname=executeQuery.getString("FIRST_NAME");
					String lname=executeQuery.getString("LAST_NAME");
					System.out.print("First Name : "+fname);
					System.out.print("Last Name : "+lname);
				}
				
				//Close all connections
				executeQuery.close();
				stmt.close();
				conn.close();
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		SQLDemo db=new SQLDemo();
		db.database();
		
	}

}
