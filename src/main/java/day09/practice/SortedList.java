package day09.practice;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class SortedList {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Numbers");
		String line1 = scan.nextLine();
		String[] linesplit = line1.split(" ");
		
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=0; i<linesplit.length; i++) {
			arr.add(Integer.parseInt(linesplit[i]));
		}
		
		Collections.sort(arr);
		
		System.out.println("Sorted list: " + arr);
	}

}
