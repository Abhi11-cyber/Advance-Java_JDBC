import java.sql.*;
public class createTable {
        public static void main(String[] args) {
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String user = "SYSTEM";
            String password = "ABHI11";

            try {
                   Class.forName("oracle.jdbc.driver.OracleDriver");

                   Connection conn = DriverManager.getConnection(url, user, password);

                   Statement stmt = conn.createStatement();

                   stmt.execute("create table student(roll_no number(5),name varchar(25),marks number(10))");
                   System.out.println("Table is created successfully");

                   conn.close();
                   stmt.close();
                   
            } catch (Exception e) {
                 System.out.println(e);

            }        
        }
}
