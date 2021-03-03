package academy.belhard.db;

import academy.belhard.db.creds.DbCredentialsProvider;
import academy.belhard.db.creds.LocalDbCredsProvider;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

    private static DbCredentialsProvider credentialsProvider = new LocalDbCredsProvider();

    public static Connection getConnection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(credentialsProvider.getUrl(), credentialsProvider.getUser(), credentialsProvider.getPassword());
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
}
