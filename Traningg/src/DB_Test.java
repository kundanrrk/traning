
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.*;
import billing.Bill;
import java.util.*;
import java.util.Map.Entry;

public class DB_Test  {
  public static void main(String[] args) {
  
try { 
		    Class.forName("org.apache.derby.jdbc.ClientDriver"); 
            Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/sample;create=true","user", "user");
            String query = "insert into app.employee values('103','C++')";
            
            Statement st = connection.createStatement();
            int count = st.executeUpdate(query);
            System.out.println(count+" Row Added Successfully");
          
               // System.out.println(rs.getString(1)+" "+rs.getString(2));
               // System.out.println(rs.getString(2));
            
            connection.close();

        } catch (ClassNotFoundException | SQLException se) {
            se.printStackTrace();
      }
  }
}





