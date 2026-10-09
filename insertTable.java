
import java.sql.*;

public class insertTable {

    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String user = "SYSTEM";
        String password = "ABHI11";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection conn = DriverManager.getConnection(url, user, password);

            Statement stmt = conn.createStatement();

            stmt.execute("INSERT INTO STUDENT (ROLL_NO, NAME, MARKS) VALUES (1, 'Abhishek', 99)");
            stmt.execute("INSERT INTO STUDENT (ROLL_NO, NAME, MARKS) VALUES (2, 'Aditya', 100)");
            stmt.execute("INSERT INTO STUDENT (ROLL_NO, NAME, MARKS) VALUES (3, 'Ankush', 95)");

            System.out.println("Table is updated successfully");

            conn.close();
            stmt.close();

        } catch (Exception e) {
            System.out.println(e);

        }
    }
}
