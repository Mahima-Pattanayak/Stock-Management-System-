
package MainFiles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author mahima
 */
public class DBConnect {
    static Connection ConnectDb() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private Connection con;
    private Statement st;
    private ResultSet rs;
   
    @SuppressWarnings({"BroadCatchBlock", "TooBroadCatch"})
    public DBConnect(){
    try{
          Class.forName("com.mysql.jdbc.Driver");
          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_stock","root","");
          st = con.createStatement();
    
    }catch(Exception e){System.out.println("Error"+e);}
    
    } 
}
