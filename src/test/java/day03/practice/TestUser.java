package day03.practice;

public class TestUser {
	
	public static void main(String[] args) {
    	System.out.println();
        User u1 = new User("Naresh", "12345naresh", "naresh@gmail.com");
        System.out.println("Name="+u1.getName()+", Password="+u1.getPassword()+", Email="+u1.getEmail());
        User u2 = new User();
    }

}