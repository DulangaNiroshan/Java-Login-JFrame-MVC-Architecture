package Model;

import Database.DatabaseConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginModel {
    public static boolean authenticateUser(String username, String password, String acctype) {
        String query = "SELECT * FROM accounts WHERE username=? AND password=? AND acctype=?";
        try (Connection con = DatabaseConnector.connect();
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setString(1, username);
            pst.setString(2, password);
            pst.setString(3, acctype);

            try (ResultSet rs = pst.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Database Error: " + ex.getMessage(), ex);
        }
    }
}
