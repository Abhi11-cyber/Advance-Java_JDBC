import java.sql.*;
public class MySQLTest {
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@localhost:1521:xe"; // Default XE connection
        String user = "SYSTEM";
        String password = "ABHI11";

        try {
            // Load or Register Oracle JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Create connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("CONNECTION SUCCESSFUL!");

            // Create statement
            Statement stmt = conn.createStatement();

            // Execution of Simple version query for Oracle
            ResultSet rs = stmt.executeQuery("SELECT banner FROM v$version WHERE ROWNUM = 1");

            while(rs.next()) {
                System.out.println("Oracle version: " + rs.getString(1));
            }

            //Close Connection&resources.
            conn.close();
            rs.close();
            stmt.close();
        } catch (Exception e) {
            System.out.println("CONNECTION FAILED!");
            e.printStackTrace();
        }
    }
}
