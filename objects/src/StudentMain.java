import java.util.*;
public class StudentMain {
	public static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		Student student1 = new Student();
		System.out.println("enter a name");
		String name = reader.next();
		student1.setName(name);
		student1.setGrades(80, 100);
		System.out.println("the final grade of "+ student1.getName() + "is: "+ student1.finalGrade());
	}
	
}
