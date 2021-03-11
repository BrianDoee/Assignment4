package homework4;

/**
 * Student tester class
 * @author brian
 *
 */
public class StudentTest {

	public static void main(String args[]) throws CloneNotSupportedException {
		Course CS151 = new Course("CS151", "Object Oriented Design and Programming", "CS", "6:00 P.M.", " Tue.");

		Student student = new Student("John", "Smith", 20, (float)3.6, "Computer Science major", "School of Computer Science department", CS151);
		student.printInfo();

		Student student2 = (Student) student.clone();
		System.out.println("");
		student2.printInfo();
	}

}