package democonnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager_database {
		private static final String url = "jdbc:mysql://localhost:3306/stud";
		private static final String username = "root";
		private static final String password="root";
		
		public static Connection getConnection() {
			Connection conn = null;
			try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url,username,password);
			System.out.println("Connected"+conn);
			}
			catch(SQLException e) {
				System.out.println("COnnection error :"+e);
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}			return conn;
		}
}		
