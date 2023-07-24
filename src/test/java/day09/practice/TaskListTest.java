package day09.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TaskListTest {
	@Test
	void test() {
	 List<Task> tasks = new ArrayList<>();
     tasks.add(new Task(3, "Coding", "2022-01-22"));
     tasks.add(new Task(5, "Product Design", "2022-10-01"));
     tasks.add(new Task(1, "Software Design", "2022-10-07"));
     tasks.add(new Task(3, "Coding", "2022-10-22")); 
    
     Collections.sort(tasks);

     
     for (Task task : tasks) {
         System.out.println(task.getId() + "," + task.getName() + "," + task.getDeadline());
     }
 }
}
