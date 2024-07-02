
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDemo {

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "user", "password");

            String sql = "UPDATE student_info SET name = ?, address = ?, college = ? WHERE roll = ?";
            ps = conn.prepareStatement(sql);

            ps.setString(1, "New Name");
            ps.setString(2, "New Address");
            ps.setString(3, "New College");
            ps.setInt(4, 123);

            int i = ps.executeUpdate();

            if (i > 0) {
                System.out.println("Record updated successfully");
            } else {
                System.out.println("Failed to update the record");
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
