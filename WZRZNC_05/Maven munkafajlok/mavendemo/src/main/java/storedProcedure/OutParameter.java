package storedProcedure;

import java.sql.*;
 

public class OutParameter {
 
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
 
            CallableStatement statement = conn.prepareCall("{call breed_count(?, ?)}");
        ) {
 
            statement.setString(1, "Sziami");
            statement.registerOutParameter(2, Types.INTEGER);
 
            statement.execute();
            int count=statement.getInt(2);
            statement.close();   
            
            System.out.println("Breed count: "+count);
 
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}