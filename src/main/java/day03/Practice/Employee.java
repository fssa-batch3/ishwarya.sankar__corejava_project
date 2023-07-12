package day03.Practice;

public class Employee {

	 private int id;
	    private String name;
	 
	    public Employee(int id, String name) {
	        this.id = id;
	        this.name = name;}
	    

	    public static void main(String[] args) {
	        Employee e1 = new Employee(1, "ishu");
	        Employee e2 = new Employee(2, "sankar");
	        
	        System.out.println("id="+e1.id+", "+"name="+e1.name);
	        System.out.println("id="+e2.id+", "+"name="+e2.name);
	    }
}
