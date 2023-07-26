package Ishutest.java;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

	public class Ishwarya{
		
		 public static String departwiseSortedPrinting(List<String> departmentNameList) {
			StringBuilder value1 = new StringBuilder("");
			Map<String, TreeSet<String>> deptEmpNameMap= new TreeMap<String,TreeSet<String>>(); 
			if(departmentNameList == null) {
				return "";
			}
			else {
				for(String sourceLine:departmentNameList) {
					String[] keyValuePair = sourceLine.split(",");
					if(deptEmpNameMap.containsKey(keyValuePair[0])) {
						Set<String> empNameSet = deptEmpNameMap.get(keyValuePair[0]);
						empNameSet.add(keyValuePair[1]);
					}
					else {
						TreeSet<String> empNameSet = new TreeSet<String>();
						empNameSet.add(keyValuePair[1]);
						deptEmpNameMap.put(keyValuePair[0],empNameSet);
					}
					
				}
			}
			
			Set<String> deptKeySet = deptEmpNameMap.keySet();
			for(String dept:deptKeySet) {
				value1.append(dept);
				value1.append(":");
				value1.append(deptEmpNameMap.get(dept));
				value1.append("\n");
			}
			return value1.toString();
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int numOfLines = sc.nextInt();
			sc.nextLine();
			List<String> inputLines = new ArrayList<String>(numOfLines);
			
			for(int i = 0; i < numOfLines; i++) {
				inputLines.add(sc.nextLine());
			}
			
			sc.close();
			System.out.println(departwiseSortedPrinting(inputLines));
		}
	}
	 

