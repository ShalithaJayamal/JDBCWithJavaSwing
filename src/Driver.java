  
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//get a connection to data base
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/salescompany","root","");
			
			//Create a statement
			Statement myStmt = myConn.createStatement();
			
			//Execute  Sql query 
			ResultSet myRs = myStmt.executeQuery("SELECT * FROM STAFF");
			
			//Execute the Result  set
			while(myRs.next()) {
				
				System.out.println("aaa");
;				
			}
			
			
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		

	}

}
