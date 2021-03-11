package homework4;

/**
 * Employee test class
 * @author brian
 *
 */
public class EmployeeTest {
	
	/**
	 * Main Method 40,23,1, 0 , -5, 45
	 * @param args
	 */
	public static void main(String args[]) {
		
		Employee employee = new Employee("John", "Smith", "101", 35);
		
		
		try {
			System.out.println("40 Hours of work = " + "$" +  employee.computePay(40));
		}
		catch(TooManyHoursWorkedException exception) {
			System.out.println("Too many hours worked! ");
			System.out.println(exception);
		}
		catch(NumberFormatException exception) {
			System.out.println("Can't have negative hours worked!");
			System.out.println(exception);
		}
		System.out.println("");
		
		try {
			System.out.println("23 Hours of work = " + "$" +  employee.computePay(23));
		}
		catch(TooManyHoursWorkedException exception) {
			System.out.println("Too many hours worked! ");
			System.out.println(exception);
		}
		catch(NumberFormatException exception) {
			System.out.println("Can't have negative hours worked!");
			System.out.println(exception);
		}
		System.out.println("");
		
		try {
			System.out.println("1 Hour of work = " + "$" +  employee.computePay(1));
		}
		catch(TooManyHoursWorkedException exception) {
			System.out.println("Too many hours worked! ");
			System.out.println(exception);
		}
		catch(NumberFormatException exception) {
			System.out.println("Can't have negative hours worked!");
			System.out.println(exception);
		}
		System.out.println("");
		
		try {
			System.out.println("0 Hours of work = " + "$" +  employee.computePay(0));
		}
		catch(TooManyHoursWorkedException exception) {
			System.out.println("Too many hours worked! ");
			System.out.println(exception);
		}
		catch(NumberFormatException exception) {
			System.out.println(exception);
			System.out.println("Can't have negative hours worked!");
			
		}
		System.out.println("");
		
		try {
			System.out.println("-5 Hours of work = " + "$" +  employee.computePay(-5));
		}
		catch(TooManyHoursWorkedException exception) {
			System.out.println("Too many hours worked! ");
			System.out.println(exception);
		}
		catch(NumberFormatException exception) {
			System.out.println(exception);
			System.out.println("Can't have negative hours worked!");
			
		}
		System.out.println("");
		
		try {
			System.out.println("-5 Hours of work = " + "$" +  employee.computePay(45));
		}
		catch(TooManyHoursWorkedException exception) {
			System.out.println(exception);
			System.out.println("Too many hours worked! ");
			
		}
		catch(NumberFormatException exception) {
			System.out.println(exception);
			System.out.println("Can't have negative hours worked!");
			
		}
		System.out.println("");
		
		
		
	}

}
