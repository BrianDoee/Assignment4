package homework4;

/**
 * Course Class
 * @author brian
 *
 */
public class Course implements Cloneable {

	public String courseName;
	public String description;
	public String department;
	public String timeCourseStarts; 
	public String courseDay;

	/**
	 * Constructor for course class
	 * @param courseName
	 * @param description
	 * @param department
	 * @param timeCourseStarts
	 * @param courseDay
	 */
	public Course(String courseName, String description, String department, String timeCourseStarts, String courseDay) {

		this.courseName = courseName;
		this.department = department;
		this.description = description;
		this.timeCourseStarts = timeCourseStarts;
		this.courseDay = courseDay;

	}

	/**
	 * Sets the course name
	 * @param courseName
	 */
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	/**
	 * Gets the course name
	 * @return
	 */
	public String getCourseName() {
		return courseName;
	}

	/**
	 * Gets the course description
	 * @return
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the course description
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Gets the department
	 * @return
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * Sets the department
	 * @param department
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * Gets the time the course starts
	 * @return
	 */
	public String getTimeCourseStarts() {
		return timeCourseStarts;
	}

	/**
	 * Sets the time the course starts
	 * @param timeCourseStarts
	 */
	public void setTimeCourseStarts(String timeCourseStarts) {
		this.timeCourseStarts = timeCourseStarts;
	}

	/**
	 * Gets the course day
	 * @return
	 */
	public String getCourseDay() {
		return courseDay;
	}

	/**
	 * Sets the course day
	 * @param courseDay
	 */
	public void setCourseDay(String courseDay) {
		this.courseDay = courseDay;
	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}


}
