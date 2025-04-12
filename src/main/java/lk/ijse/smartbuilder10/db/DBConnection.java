package lk.ijse.smartbuilder10.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static DBConnection dbConnection;
    Connection con;

    private DBConnection() throws SQLException , ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
       con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hardware", "root", "12981298La");
    }

    public static DBConnection getInstance() throws SQLException , ClassNotFoundException {
        if (dbConnection == null) {
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }

    public Connection getConnection() throws SQLException , ClassNotFoundException {
        return con;
    }

}
