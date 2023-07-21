package day08.practice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Department {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of inputs: ");
		int number = scanner.nextInt();
		scanner.nextLine(); // Consume the remaining newline character after reading the integer
		System.out.println("Enter the strings: ");

		String[] array = new String[number];

		for (int i = 0; i < number; i++) {
			array[i] = scanner.nextLine();
		}

		// Create a HashMap to store the list of employees for each department
		HashMap<String, List<String>> department = new HashMap<>();

		for (int i = 0; i < array.length; i++) {
			String[] splitValue = array[i].split(",");
			String departName = splitValue[0].trim();
			String employeeName = splitValue[1].trim();

			if (department.containsKey(departName)) {
				List<String> employees = department.get(departName);
				employees.add(employeeName);
			} else {
				List<String> employees = new ArrayList<>();
				employees.add(employeeName);
				department.put(departName, employees);
			}
		}

		// Output DeptName, List of Employees
		for (String departmentName : department.keySet()) {
			List<String> employees = department.get(departmentName);
			System.out.println(departmentName + ": " + employees);
		}

		scanner.close();
	}
	

}
