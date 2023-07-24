
package day06.practice;
import java.util.List;
//import java.util.ArrayList;

public class Tasklist {

	  private String taskName;
	    private int priority;
	    
	     public Tasklist(String name,int n) {
	    	 this.taskName = name;
	    	 this.priority = n;
	     }
	     
	     public Tasklist(String taskName ) {
	    	 this.taskName = taskName;
	    
	     }
	     public void setTaskName(String taskName) {
	    	 this.taskName = taskName;
	     }
	     public String gettaskName() {
	    	 return taskName;
	     }
	     public void TaskPriority(int priority) {
	    	 this.priority = priority;
	     }
	     public int getTaskPriority() {
	    	 return priority;
	     }
  }
