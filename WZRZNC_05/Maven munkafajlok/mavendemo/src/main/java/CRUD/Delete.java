package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {

    private static final String DELETE_USERS_SQL = "delete from cats where breed = 'Perzsa' and owner = 'Gal Dora';";

    public static void main(String[] argv) throws SQLException {
    	try {
    		Class.forName("com.mysql.jdbc.Driver");
    	}catch(ClassNotFoundException cf) {
    	}
        Delete deleteStatementExample = new Delete();
        deleteStatementExample.deleteRecord();
    }

    public void deleteRecord() throws SQLException {
        System.out.println(DELETE_USERS_SQL);

        // Step 1: Establishing a Connection
        try (Connection connection = DriverManager
        	.getConnection("jdbc:mysql://localhost:3306/cats", "wzrznc", "password");

            // Step 2:Create a statement using connection object
            Statement statement = connection.createStatement();) {

            // Step 3: Execute the query or update query
            int result = statement.executeUpdate(DELETE_USERS_SQL);
            System.out.println("Number of records affected :: " + result);
        } catch (SQLException e) {

            // print SQL exception information
            printSQLException(e);
        }

        // Step 4: try-with-resource statement will auto close the connection.
    }

    public static void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}
