package day12.practice;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import day06.practice.Tasklist;
import day11.Solved.ConnectionUtil;

public class TaskDAO {

	public void createTask(Task task) throws DAOException {
		try (Connection connection = ConnectionUtil.getConnection();
				PreparedStatement stmt = connection
						.prepareStatement("INSERT INTO tasks (id, taskname, taskstatus) VALUES (?, ?, ?)")) {	// This is the try-with-resources
			
			stmt.setInt(1,task.getId());
			stmt.setString(2,task.getTaskName());
			stmt.setString(3, task.getStatus());
			
			stmt.executeUpdate();

	        
			// Hint: Set the values for the PreparedStatement using task properties

			// Hint: Execute the update statement
		} catch (SQLException e) {
			throw new DAOException("Error in createTask method", e);
		}
	}

	public void updateTask(Task task) throws DAOException {
		try (Connection connection = ConnectionUtil.getConnection()){
			// Hint: Add the SQL update statement here
			  String query = "UPDATE tasks SET taskname=? WHERE id=?";
			  PreparedStatement pst = connection.prepareStatement(query);
		        pst.setString(1, task.getTaskName());
		        pst.setInt(2, task.getId());
		 
		        int rows = pst.executeUpdate();
		        System.out.println("No of rows updated" + rows);
			// Hint: Set the values for the PreparedStatement using task properties

			// Hint: Execute the update statement
		} catch (SQLException e) {
			throw new DAOException("Error in updateTask method", e);
		}
	}

	public void deleteTask(int id) throws DAOException {
			// Hint: Add the try-with-resources for delete query here
			try (Connection connection = ConnectionUtil.getConnection();
					PreparedStatement stmt = connection.prepareStatement("DELETE from tasks WHERE id=?")) {
				stmt.setInt(1, id);
				// Hint: Execute the update statement
				int rows = stmt.executeUpdate();
				System.out.println("No of rows inserted :" + rows);
				stmt.close();
				connection.close();
			} catch (SQLException e) {
				throw new DAOException("Error in createTask method", e);
			}
		}
			// Hint: Set the value for the PreparedStatement using the taskId

			// Hint: Execute the delete statement
			
			// Hint: Catch the SQLException and throw DAOException with appropriate message
	

	public List<Task> getAllTasks() throws DAOException {
		List<Task> tasks = new ArrayList<>();

		try (Connection connection = ConnectionUtil.getConnection();
				PreparedStatement stmt = connection.prepareStatement("SELECT id, taskname, taskstatus FROM tasks");
				ResultSet rs = stmt.executeQuery()) {

			 while ( rs.next()) {
//		        	int userId = rs.getInt("user_id");            
		        	String userName = rs.getString("taskname");
		            int id = rs.getInt("id");
		        	String  Status = rs.getString("taskstatus");

		            Task task = new Task(id,userName,Status);
		            tasks.add(task);
		             
		           
		        }
			// Hint: Iterate over the ResultSet to create Task objects and add them to the
			// tasks list

		} catch (SQLException e) {
			throw new DAOException("Error in getAllTasks method", e);
		}

		return tasks;
	}
}