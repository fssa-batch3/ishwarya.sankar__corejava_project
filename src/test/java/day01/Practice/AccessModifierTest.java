package day01.Practice;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccessModifierTest {

	  @Test
	    public void testSetAndGetFirst() {
	        AccessModifierTest one = new AccessModifierTest();
	         System.out.println("Ishwarya");
	        one.setFirst("Ishwarya");
	        
	        if(one.getFirst().equals("Ishwarya")) {
	        	System.out.println("Pass");
	        	
	        }else {
	          System.out.println("Fail");
	        	
	        }
	        assertEquals("Ishwarya", one.getFirst());
	    }

	  @Test
	    public void testSetAndGetSecond() {
	        AccessModifierTest one = new AccessModifierTest();
	        System.out.println("sankar");
	        one.setSecond("sankar");
	        if(one.getSecond().equals("sankar")) {
	        	System.out.println("Pass");
	        	
	        }else {
	          System.out.println("Fail");
	        	
	        }
	        assertEquals("sankar", one.getSecond());
	    }

	    @Test
	    public void testSetAndGetThird() {
	        AccessModifierTest one = new AccessModifierTest();
	        System.out.println("Abinaya");
	        one.setThird("Abinaya");
	        if(one.getThird().equals("Abinaya")) {
	        	System.out.println("Pass");
	        	
	        }else {
	          System.out.println("Fail");
	        	
	        }
	        assertEquals("Abinaya", one.getThird());
	    }

	    @Test
	    public void testSetAndGetFourth() {
	        AccessModifierTest one = new AccessModifierTest();
	        System.out.println("Dhanush");
	        one.setFourth("Dhanush");
	        if(one.getFourth().equals("Dhanush")) {
	        	System.out.println("Pass");
	        	
	        }else {
	          System.out.println("Fail");
	        	
	        }
	       
	        assertEquals("Dhanush", one.getFourth());
	    }
	}

