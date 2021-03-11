package homework4;

/**
 * Employee Class
 * @author brian
 *
 */
public class Employee {
	public String fistName;
	public String lastName;
	public String employeeID;
	public float hourlyPay;
	
	/**
	 * Constructor for employee class
	 * @param firstName
	 * @param lastName
	 * @param employeeID
	 * @param hourlyPay
	 */
	public Employee(String firstName, String lastName, String employeeID, float hourlyPay) {
		this.fistName = firstName;
		this.lastName = lastName;
		this.employeeID = employeeID;
		this.hourlyPay = hourlyPay;
	}

	/**
	 * Gets the first name
	 * @return
	 */
	public String getFistName() {
		return fistName;
	}

	/**
	 * Sets the first name
	 * @param fistName
	 */
	public void setFistName(String fistName) {
		this.fistName = fistName;
	}

	/**
	 * Gets the last name
	 * @return
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Gets the employee ID
	 * @return
	 */
	public String getEmployeeID() {
		return employeeID;
	}

	/**
	 * Sets the employee ID
	 * @param employeeID
	 */
	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	/**
	 * Gets the hourly pay
	 * @return
	 */
	public float getHourlyPay() {
		return hourlyPay;
	}

	/**
	 * Sets the hourly pay
	 * @param hourlyPay
	 */
	public void setHourlyPay(float hourlyPay) {
		this.hourlyPay = hourlyPay;
	}
	
	/**
	 * Computes the pay for the employee
	 * @param hoursWorked
	 * @return
	 * @throws NumberFormatException
	 * @throws TooManyHoursWorkedException
	 */
	public float computePay(int hoursWorked) throws NumberFormatException, TooManyHoursWorkedException {
		
		if(hoursWorked < 0) {
			throw new NumberFormatException();
		}
		else if(hoursWorked > 40) {
			throw new TooManyHoursWorkedException();
		}
		return (hoursWorked)*(this.hourlyPay);
		
		
	}
	
	

}
