package dataAccess.dbHelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbHelper {
	private String userName = "root";
	private String password = "admin12345";
	private String dbURL = "jdbc:mysql://localhost:3306/gtys_db_main";
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection(dbURL,userName,password);
	}
	public void showErrorMessage(SQLException exception) {
		System.out.println("Error message :"+exception.getMessage());
	}
}