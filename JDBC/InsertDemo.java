import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDemo {

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "id", "password");
            String sql = "Insert into students (names, address, email) Values(?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, "Rajib");
            ps.setString(2, "Jhapa");
            ps.setString(3, "pokhrel@gmail.com");

            int i = ps.executeUpdate();
            if (i > 0) {
                System.out.println("Inserted Successfully");
            } else {
                System.out.println("Insertion Failed");
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