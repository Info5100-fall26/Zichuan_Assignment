import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseTest {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testDB",
                "root",
                ""
            );

            System.out.println("Connected to database successfully!");

            conn.setAutoCommit(false);

            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                System.out.println(id + " " + name + " " + age);
            }

            rs.close();

            int rows = stmt.executeUpdate(
                "UPDATE students SET age = 21 WHERE id = 1"
            );

            System.out.println("Updated rows: " + rows);

            conn.rollback();

            System.out.println("Rollback completed!");

            stmt.close();
            
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}