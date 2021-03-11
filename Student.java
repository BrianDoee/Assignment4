package homework4;
import java.io.*;

/**
 * Student Class
 * @author brian
 *
 */
public class Student implements Cloneable {

	public String firstName;
	public String lastName;
	public int age;
	public float gpa;
	public String major;
	public String department;
	public Course course;

	/**
	 * Constructor for student Class
	 * @param firstName
	 * @param lastName
	 * @param age
	 * @param gpa
	 * @param major
	 * @param department
	 */
	public Student(String firstName, String lastName, int age, float gpa, String major, String department, Course course) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gpa = gpa;
		this.major = major;
		this.department = department;
		this.course = course;

	}

	/**
	 * Sets the first name
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the first name
	 * @return
	 */
	public String getFirstname() {
		return firstName;
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
	 * Gets the age
	 * @return
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Sets the age
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * Gets the gpa
	 * @return
	 */
	public float getGpa() {
		return gpa;
	}

	/**
	 * Sets the gpa
	 * @param gpa
	 */
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}

	/**
	 * Gets the major
	 * @return
	 */
	public String getMajor() {
		return major;
	}

	/**
	 * Sets the major 
	 * @param major
	 */
	public void setMajor(String major) {
		this.major = major;
	}

	/**
	 * Gets the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * Sets the department
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * Sets teh course
	 * @param course
	 */
	public void setCourse(Course course) {
		this.course = course;
	}

	/**
	 * Gets the course
	 * @return
	 */
	public Course getCourse() {
		return course;
	}

	protected Object clone() throws CloneNotSupportedException {
		Student student = (Student) super.clone();
		student.course = (Course) course.clone();
		return student;
	}

	/**
	 * Prints information about the student
	 */
	public void printInfo() {
		System.out.println("First Name : " + this.firstName);
		System.out.println("Last Name : " + this.lastName);
		System.out.println("Age : " + this.age);
		System.out.println("GPA : " + this.gpa);
		System.out.println("Major : " + this.major);
		System.out.println("Department : " + this.department);
		System.out.println("Course Name : " + this.course.getCourseName());
		System.out.println("Course Description : " + this.course.getDescription());
		System.out.println("Department : " + this.course.getDepartment());
		System.out.println("Time : " + this.course.getTimeCourseStarts());
		System.out.println("Day : " + this.course.getCourseDay());
	}


}