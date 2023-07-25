package day11.practice;


import java.sql.SQLException;

import org.junit.jupiter.api.Test;

public class TaskDAOTest {
	
	 @Test
	 void test()  throws SQLException {
	   
	        TaskDAO taskDAO = new TaskDAO();
	        Task task = new Task();
	        task.id = 4;
	        task.name = "Task 1";
	        task.status = "Pending";

	        try {
	            taskDAO.createTask(task);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    

}
}