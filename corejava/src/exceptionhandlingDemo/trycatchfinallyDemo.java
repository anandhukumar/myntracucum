package exceptionhandlingDemo;

public class trycatchfinallyDemo {

	public static void main(String[] args) {
		System.out.println("open browser");
		System.out.println("login application");
		
	 try {
			System.out.println("business logic"+ " "+ 10/0);	
		}catch(Exception t) {
			System.out.println("catch block programming having logical issue");
		}
	 finally {
		 System.out.println("finally block executes");
	 }
		
		
		System.out.println("logout system");
		System.out.println("close browser");

	}

}
