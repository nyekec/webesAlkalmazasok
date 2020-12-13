package storedProcedure;

import java.sql.*;
 

public class InResultSet {
 
    public static void main(String[] args) {
        String dbURL = "jdbc:mysql://localhost:3306/cats";
        String user = "wzrznc";
        String password = "password";
        
        try {
    		Class.forName("com.mysql.jdbc.Driver");
    	}catch(ClassNotFoundException cf) {
    	}
 
 
        try (
 
            Connection conn = DriverManager.getConnection(dbURL, user, password);
 
            CallableStatement statement = conn.prepareCall("{call get_cats_for_owner(?)}");
        ) {
 
            statement.setString(1, "Kis Dezso");
 
            ResultSet rs=statement.executeQuery();
			while (rs.next()) {
				System.out.println("Id = " + rs.getInt(1)+", Name = "+rs.getString(2)+", Breed = "+rs.getString(3)+", Age = "+rs.getInt(4)+", Owner = "+rs.getString(5));	
			}
			
            statement.execute();
            statement.close();
 
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}