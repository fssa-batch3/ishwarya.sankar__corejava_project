package day07.practice;

import java.util.ArrayList;
import java.util.HashSet;

import org.junit.jupiter.api.Test;

public class TaskListTest {
	@Test
	void test() {
	ArrayList<Task> tasks = new ArrayList<Task>();
	tasks.add(new Task(1, "ishu", "2023-07-20"));
	tasks.add(new Task(2, "sankar", "2023-05-29"));
	tasks.add(new Task(3, "papu", "2023-05-29"));
	tasks.add(new Task(3, "abi", "2023-11-09"));
	
	HashSet<Task> tasks1 = new HashSet<Task>(tasks);

	
	for(Task t:tasks1) {
		
		System.out.println("Using Hashset :" + t.printId());
		System.out.println("Using Hashset :" + t.printName());	
		System.out.println("Using Hashset :" + t.printDeadline());	
	}
	
}
