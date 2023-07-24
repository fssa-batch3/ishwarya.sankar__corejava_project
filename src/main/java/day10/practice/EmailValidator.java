package day10.practice;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
	public static boolean isValidEmail(String emailId) throws InvalidEmailException {


	  public static boolean validateEmail(String email) {
	        String pattern = "^[a-z]{1}[a-zA-Z0-9._-]*@[a-z]+\\.[a-z]+$";
	        Pattern emailPattern = Pattern.compile(pattern);
	        Matcher matcher = emailPattern.matcher(email);
	        return matcher.matches();
	    }

	public static void main(String[] args) {
		
		String email = "ishusankar@gmail.com";
		
		if (validateEmail(email)) {
			System.out.println(email + " is valid");
		}else {
			System.out.println(email + " is not  valid");
		}
		
		

	}

}
