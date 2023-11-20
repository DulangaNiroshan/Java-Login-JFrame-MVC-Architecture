package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {

    private static String url = "jdbc:mysql://localhost:3306/istore";
    private static String uname = "root";
    private static String pwd = "";

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(url, uname, pwd);
    }
}
