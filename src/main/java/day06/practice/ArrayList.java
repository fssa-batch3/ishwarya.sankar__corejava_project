
package day06.practice;
import java.util.List;
//import java.util.ArrayList;

public class ArrayList {

	  public String taskName;
	    public int priority;
	    
	     public ArrayList(String taskName , int priority) {
	    	 this.taskName = taskName;
	    	 this.priority = priority;
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
