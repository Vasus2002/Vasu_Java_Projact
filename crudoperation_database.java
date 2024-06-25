package democonnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class crudoperation_database {
		public void createtable() {
			String createtable = "CREATE TABLE emp1("
				+ "s_id int(10) NOT NULL,"
				+ "name varchar(20),"
				+ "age int(10)"
					+")";
			try(Connection conn = ConnectionManager_database.getConnection();
				Statement stmt = conn.createStatement()){
				stmt.execute(createtable);
				System.out.print("Create table emp1");
			}catch(SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		
		public void insertdata(Empdata_database em) {
			String insertSql = "INSERT INTO emp1"
					+ " (s_id,name,age) VALUES"
	                + "("+em.getS_id()+",'"
	                + em.getName() + "',"
	                + em.getAge() +")";
	                
		try(Connection conn = ConnectionManager_database.getConnection();
				Statement stmt = conn.createStatement()){

			stmt.execute(insertSql);
			System.out.println("Insert record ");
			
			
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		}
		public void updatedata(int s_id,String name,int age) {
			String updateSql="UPDATE emp1 SET "
					+ "name = '" + name+ "' ,"
					+ "age ='"+ age +"'"
					+ "WHERE s_id=" + s_id;
			try(Connection conn = ConnectionManager_database.getConnection();
					Statement stmt = conn.createStatement()){

				stmt.execute(updateSql);
				System.out.println("update record ");
				
				
			}catch(SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		public void deleteRecord(int s_id) {
	        String deleteSQL = "DELETE FROM emp1 WHERE s_id = " + s_id;

	        try (Connection conn = ConnectionManager_database.getConnection();
	             Statement stmt = conn.createStatement()) {

	            stmt.executeUpdate(deleteSQL);
	            System.out.println("Record is deleted from emp!");

	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }
	    }
		public void getRecord(int s_id) {
	        String selectSQL = "SELECT * FROM emp1 WHERE s_id = " + s_id;
	        
	        try (Connection conn = ConnectionManager_database.getConnection();
	             Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(selectSQL)) {

	            while (rs.next()) {
	                System.out.println("s_id ID: " + rs.getInt("s_id"));
	                System.out.println("Name: " + rs.getString("NAME"));
	                System.out.println("Age: " + rs.getInt("AGE"));
//	                System.out.println("Created Date: " + rs.getDate("CREATED_DATE"));
	            }

	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }
	    }
}
