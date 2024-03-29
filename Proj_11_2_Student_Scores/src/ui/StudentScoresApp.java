package ui;
import java.util.Arrays;

import business.Student;
import util.Console;

public class StudentScoresApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Student Scores Application\n");
		
		int numberStudents = Console.getInt("Number of students: ", 0, 501);
		
		Student[] studs = new Student[numberStudents];
		
		for (int i = 0; i < numberStudents; i++) {
			
			System.out.println("\nSTUDENT " + (i+1) );
			String lastName = Console.getString("Last name: ");
			String firstName = Console.getString("First name: ");
			int score = Console.getInt("Score: ", -1, 101); 
			
			Student s1 = new Student(lastName, firstName, score);
			
			studs[i] = s1;
		}
		
		Arrays.sort(studs);
		
		System.out.println("\nSUMMARY");
		for (Student s: studs) {
			System.out.println(s);
		}
		
		System.out.println("Bye!");

	}

}
