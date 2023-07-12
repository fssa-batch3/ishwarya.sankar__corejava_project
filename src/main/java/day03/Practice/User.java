package day03.Practice;

public class User {
	private String name;
	private String email;
	private String pass;
	
	
	public User() {	
	}
	
	public User(String name , String email, String pass) {
		this.name = name;
		this.email = email;
		this.pass = pass;
				
	}
	
	public String getName() {
		return name;
	}
	public void SetName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void SetEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void SetPass(String pass) {
		this.pass = pass;
	}
	
	
	public static void main(String[]args) {
		User details = new User();
		details.SetName("ishu");
		details.SetEmail("ishusankar14@gmail.com");
		details.SetPass("90909");
		
		System.out.println("User 1");
		System.out.println("Name" + " = " + details.getName());
		System.out.println("Email" + " = " + details.getEmail());
		System.out.println("Password" + " = " +  details.getPass());
		
		System.out.println();
		User two = new User("ice" , "ice14@gmail.com", "9098");
		System.out.println("User 2");
		System.out.println("Name" + " = " + two.getName());
		System.out.println("Email" + " = " + two.getEmail());
		System.out.println("Password" + " = " + two.getPass());
		
	}
}
