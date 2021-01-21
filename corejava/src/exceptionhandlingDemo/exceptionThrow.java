package exceptionhandlingDemo;
/*
 * exception handling:
 * exception is an event it is terminate the program upnormally,whenever the exception is rise the programming has been terminate.
 * remaining application also not execute-- when this ocuurances we need to handling the exception and resolved by using 
 * exception handling abstract(when we handling the exception in the code is terminate upnormally ,and remaining program it could be execute)
 * 
 * exception having two types:
 * 1.try,catch,finally- it is run time exception , we can use with in method
 * 2.throws key word- it is compiling time exception we can use with method  or delegate the method
 * 3.throw  can manipulate exception description message in JVM or list of exception
 * -------------------------------------------------------------------------------------------------
 * try- to write the exceptional code (logical code or positive scenarios)
 * catch- write the alternative code 
 * finally - always execute try or catch block
 * throws - it is delegate the responsibilties of exception handling to caller method
 * throw - we can create the user defined exception and throw to JVM exception.
 * 
 */
public class exceptionThrow {
	public static void main(String[] args) {
		System.out.println("open browser");
		System.out.println("login application");
		try {
			System.out.println("business logic"+" "+ 10/0);
			 
		}catch(Exception t) {
			//throw new ArithmeticException("catch block is maniplated");
			//using throw keyword
			System.out.println("user defined error message:  programme having logical issue");
			System.out.println("user defined error message"+ t);
			throw new ArithmeticException("catch block is maniplated");
		}
		finally {
			System.out.println("final block");
		}
	 
		
		
		System.out.println("logout system");
		System.out.println("close browser");

	}


}
