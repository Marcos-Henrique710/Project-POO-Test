package PooProject.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.InputStream;

public class DBConnection {
    private static final String PROPERTIES_FILE = "/application.properties";
    private static String url;
    private static String user;
    private static String password;

    static {
        try (InputStream in = DBConnection.class.getResourceAsStream(PROPERTIES_FILE)) {
            Properties p = new Properties();
            if (in != null) p.load(in);
            url = p.getProperty("db.url", "jdbc:postgresql://localhost:5432/librarydb");
            user = p.getProperty("db.user", "postgres");
            password = p.getProperty("db.password", "postgres");
            Class.forName("org.postgresql.Driver");
        } catch (Exception e) {
            e.printStackTrace();
            throw new ExceptionInInitializerError(e);
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
}
