package day02.Practice;

import day02.solved.ShapeCalculator;

public class Logger {
		public static void debug (String msg) {
			System.out.println("DEBUG: " + msg);
		}
		public static void info (String msg) {
			        System.out.println("INFO: " + msg);
			    }
	
		
		public static void error (String msg) {
			// TODO complete this code using the above template
			System.out.println("error: " + msg);
		}
		
		public static void debug (int num) {
			// TODO Complete this code
		}
		public static void main(String[] args) {
//			Logger log = new Logger();
			Logger.debug("this is an debug message");
			Logger.info("this is an  infomessage");
			Logger.error("this is an error message");
             
			
			
		}
		// Similarly write overloaded methods for error and info.
}