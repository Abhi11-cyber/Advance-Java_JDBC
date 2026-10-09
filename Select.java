import java.sql.*;

public class Select {
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE"; 
        String username = "SYSTEM"; 
        String password = "ABHI11"; 

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Load Oracle JDBC Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Connect to the database
            conn = DriverManager.getConnection(url, username, password);

            // Create a Statement
            stmt = conn.createStatement();

            // Execute a query
            String sql = "SELECT * FROM student";
            rs = stmt.executeQuery(sql);

            System.out.println("  Roll_no   "+ " Name " +"    Marks  ");
            while (rs.next()) {
                
                int id = rs.getInt("roll_no"); 
                String name = rs.getString("name"); 
                int Marks = rs.getInt("marks");

                System.out.println("    "+id  +"     " +  name  +"      "+  Marks  );

            }
               conn.close();


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Clean up and close resources
            try { if (rs != null) rs.close(); } catch (Exception e) {}
            try { if (stmt != null) stmt.close(); } catch (Exception e) {}
            try { if (conn != null) conn.close(); } catch (Exception e) {}
        }
    }
}
