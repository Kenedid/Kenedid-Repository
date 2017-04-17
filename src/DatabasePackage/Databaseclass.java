package DatabasePackage;
import java.sql.*;

import static java.util.jar.Pack200.Packer.PASS;

/**
 * Created by Kenedid on 17-04-2017.
 */
public class Databaseclass {

     // Forbinder JDBC driver med databse addarsse:
     static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
     static final String DTABASE_ADDASSE = "jdbc:mysql://localhost/users";

    // Brugernavn og kode til denne table
     static final String Tablename ="Userstable";
     static final String Tablekode = "test123test123";

    public boolean IsinformationValidate(String user, String password){
        boolean isinformationvalidate = false;
        Connection conn = null;
        Statement stmt = null;
        String sql = "";
        try{
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DTABASE_ADDASSE,Tablename,Tablekode);

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();

            sql = "SELECT * from users.users Where Name =  \"" +
                    user + "\" AND Passwrod = \"" + password + "\"";

            System.out.println(sql);

            ResultSet rs = stmt.executeQuery(sql);

            //STEP 5: Extract data from result set
            if(rs.next()){
                isinformationvalidate = true;
            }
            //STEP 6: Clean-up environment
            rs.close();
            stmt.close();
            conn.close();
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally{
            //finally block used to close resources
            try{
                if(stmt!=null)
                    stmt.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Closing Databse Connection - Goodbye!");
        return isinformationvalidate;
    }
}



