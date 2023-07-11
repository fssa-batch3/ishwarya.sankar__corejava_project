package day02.Practice;

public class User

{	
	    private int id;
	    private String name;
	    private String password;
	    private String emailId;

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public String getEmailId() {
	        return emailId;
	    }

	    public void setEmailId(String emailId) {
	        this.emailId = emailId;
	    
}
	    
		public static void main(String[] args) {
			User log = new User();
			log.setId(1);
			log.setName("Ishu");
			log.setPassword("ice");
			log.setEmailId("ishusankar14@gmail.com");
			
			System.out.println(log.getId());
			System.out.println(log.getName());
			System.out.println(log.getPassword());
			System.out.println(log.getEmailId());
			
		}
		
}


