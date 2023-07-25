package day11.practice;


import java.sql.Connection;
import java.sql.Statement;
import day11.Solved.ConnectionUtil;

public class UserInsertQuery {

    public static void main(String[] args) throws Exception {

        // Step 01: Get connection
        Connection connection = ConnectionUtil.getConnection();
        System.out.println(connection);

        // Step 02: Create a Statement
        Statement stmt = connection.createStatement();

        // Step 03: Create a Task object and initialize its properties
        Task one = new Task();
        one.id = 3;
        one.name = "Sample Task";
        one.status = "Pending";

        // Step 04: Execute Insert Query
        String query = "INSERT INTO task (id, name, status) VALUES (" + one.id + ", '" + one.name + "', '" + one.status + "')";
        int rows = stmt.executeUpdate(query);
        System.out.println("No of rows inserted: " + rows);

        // Step 05: Close the connection resources
        ConnectionUtil.close(connection, stmt, null);
    }
}