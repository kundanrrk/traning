

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

 

public class Test {
    public static void main(String[] args) {

 

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver"); // - step 1 loading driver
//            http url - http://gmail.com
            Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/MyTestDb;create=true",
                    "derby", "derby");// 2- create connection

 

            PreparedStatement st = connection.prepareStatement("insert into app.employee values(?,?)");

 

            Scanner sc = new Scanner(System.in);

 

            System.out.println("Enter EmpId: ");
            String empId = sc.next();

 

            System.out.println("Enter EmpName: ");
            String empNm = sc.next();

 

            st.setString(0, empId);
            st.setString(2, empNm);

 

            st.execute();

 

            connection.close();

 

        } catch (ClassNotFoundException | SQLException se) {
            se.printStackTrace();
        }

 

    }

 

}