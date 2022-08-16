import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class sql {
    public static void main(String[] args) throws Exception {
        String jdbcURL = "jdbc:postgresql://localhost:5432/surya";
        String username = "surya";
        String password = "6667";
        try {
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            String sql = "INSERT INTO student (name,roll_no,dob,dept_name)"
                    + "VALUES('naina','19','1998/05/18','ECE')";
            Statement statement = (Statement) connection.createStatement();
            int rows = ((java.sql.Statement) statement).executeUpdate(sql);
            if (rows > 0) {
                System.out.println("Created");
            }
            System.out.println("Connected");
            connection.close();
        } catch (SQLException e) {
            System.out.println("Error");
        }

    }
}
