import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class SelectDemo {

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            //load the jdbc driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //establish a connection
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "userid", "password");

            //create a sql query
            String sql = "Select * from student where id=?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, 1);
            rs = ps.executeQuery();

            while (rs.next()) {
                String name = rs.getString("name");
                String address = rs.getString("address");
                String email = rs.getString("email");

                System.out.println("Name : " + name);
                System.out.println("Address : " + address);
                System.out.println("Email : " + email);
            }


        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (rs != null) {
                    rs.close();
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