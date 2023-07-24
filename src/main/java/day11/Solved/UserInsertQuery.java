package day11.Solved;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class UserInsertQuery {

	public static int createUser(String username, String email, String password) throws SQLException {
		// Step 01: Get connection
		Connection connection = ConnectionUtil.getConnection();
		System.out.println(connection);

		// Step 02: Create a Statement
		Statement stmt = connection.createStatement();

		// Step 03: Execute Insert Query
		String query = "INSERT INTO user (username, email, password) VALUES (?, ?, ?)";
		PreparedStatement pst = connection.prepareStatement(query);
		pst.setString(1, username);
		pst.setString(2, email);
		pst.setString(3, password);
		int rows = pst.executeUpdate(query);
		System.out.println("No of rows inserted :" + rows);

		// Step 04: close the connection resources
		ConnectionUtil.close(connection, stmt, null);

		return rows;
	}
}