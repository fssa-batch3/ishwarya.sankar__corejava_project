package day12.practice;

import org.junit.jupiter.api.Test;

public class TaskUpdate {
	 @Test
		void test() {
	Task task1 = new Task(18,"CompletedTask","Completed");
	Task task2 = new Task(12,"Reading Books","Pending");
	Task task3 = new Task(10,"Dance","Completed");
	
	TaskDAO tsk1 = new TaskDAO();
	TaskDAO tsk2 = new TaskDAO();
	TaskDAO tsk3 = new TaskDAO();
	try {
		System.out.println("Check");
      tsk1.createTask(task1);
	tsk2.updateTask(task1);
		tsk3.deleteTask(10);
		
	} catch (DAOException e) {
		e.printStackTrace();
	}
	
}
}
