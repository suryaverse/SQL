import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class sql {
    public static void main(String[] args) throws Exception {
        String jdbcURL = "jdbc:postgresql://localhost:5432/surya";
        String username = "surya";
        String password = "6667";
        Statement statement = null;
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            String sql = "INSERT INTO college.student (name,roll_no,dob,dept_name)"
                    + "VALUES('naina','19','1998/05/18','ECE')";
            statement = connection.createStatement();
            int rows = statement.executeUpdate(sql);
            if (rows > 0) {
                System.out.println("Created");
            }
            System.out.println("Connected");
            connection.close();
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
}
