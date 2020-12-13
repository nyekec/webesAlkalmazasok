package storedProcedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InParameters {
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
 
            CallableStatement statement = conn.prepareCall("{call change_cat_owner_for_breed(?, ?)}");
        ) {
 
            statement.setString(1, "Kis Dezso");
            statement.setString(2, "Sziami");
 
            statement.execute();
            statement.close();
 
            System.out.println("Stored procedure called successfully!");
 
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
