import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
 
public class Update {
 
    public static void main(String[] args) throws SQLException {
 
        String url = "jdbc:mysql://localhost:3306/salescompany";
        String user = "root";
        String password = "";
 
        Connection myConn = null;
        Statement myStmt = null;
 
        try {
            // 1. Get a connection to database
            myConn = DriverManager.getConnection(url, user, password);
 
            // 2. Create a statement
            myStmt = myConn.createStatement();
 
            // 3. Execute SQL query
            String sql = "update employees set email='demo@luv2code.com' where id=9";
 
            int rowsAffected = myStmt.executeUpdate(sql);
 
            System.out.println("Rows affected: " + rowsAffected);
            System.out.println("Update complete.");
        }
        catch (Exception exc) {
            exc.printStackTrace();
        }
        finally {
            if (myStmt != null) {
                myStmt.close();
            }
 
            if (myConn != null) {
                myConn.close();
            }
        }
    }
}