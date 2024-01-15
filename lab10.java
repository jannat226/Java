
import java.sql.*;

public class PodcastJDBC {

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/your_database_name";
    static final String USER = "your_username";
    static final String PASS = "your_password";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            // Register JDBC driver
            Class.forName(JDBC_DRIVER);

            // Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Execute a query to create the table if it doesn't exist
            stmt = conn.createStatement();
            String createTableSQL = "CREATE TABLE IF NOT EXISTS podcasts " +
                    "(title VARCHAR(255), " +
                    " host VARCHAR(255), " +
                    " duration INT, " +
                    " release_date DATE, " +
                    " genre VARCHAR(255))";
            stmt.executeUpdate(createTableSQL);
            System.out.println("Table created or already exists.");

            // Insert some sample data
            String insertDataSQL = "INSERT INTO podcasts (title, host, duration, release_date, genre) VALUES " +
                    "('Title1', 'Host1', 30, '2022-01-01', 'Technology'), " +
                    "('Title2', 'Host2', 25, '2022-02-01', 'Science'), " +
                    "('Title3', 'Host1', 40, '2022-03-01', 'History'), " +
                    "('Title4', 'Host3', 35, '2022-04-01', 'Technology')";
            stmt.executeUpdate(insertDataSQL);
            System.out.println("Data inserted into the table.");

            // Retrieve data from the table
            String selectDataSQL = "SELECT * FROM podcasts";
            ResultSet resultSet = stmt.executeQuery(selectDataSQL);

            // Display the retrieved data
            while (resultSet.next()) {
                String title = resultSet.getString("title");
                String host = resultSet.getString("host");
                int duration = resultSet.getInt("duration");
                String releaseDate = resultSet.getString("release_date");
                String genre = resultSet.getString("genre");

                System.out.println("Title: " + title +
                        ", Host: " + host +
                        ", Duration: " + duration +
                        ", Release Date: " + releaseDate +
                        ", Genre: " + genre);
            }

        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
