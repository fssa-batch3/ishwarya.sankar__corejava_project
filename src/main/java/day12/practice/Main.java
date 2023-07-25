package day12.practice;

public class Main {

	public static void main(String[] args) {

		Task task1 = new Task(14,"CompletedTask","Completed");
		
		TaskDAO tsk = new TaskDAO();
		try {
			System.out.println("Check");
//		tsk.createTask(task1);
//			tsk.updateTask(task1);
			tsk.deleteTask(14);
			
		} catch (DAOException e) {
			e.printStackTrace();
		}
		
	}

}
