package jo.secondstep.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {

		String studentName;
		int subjectCount;
		Scanner cin = new Scanner(System.in);
		System.out.println("Please enter your name and subjects count");
		studentName = cin.next();
		subjectCount = cin.nextInt();
		cin.nextLine();

		ArrayList<String> subjectsNames = new ArrayList<String>();
		for (int i = 0; i < subjectCount; i++) {
			System.out.println("Please enter subject number " + (i + 1));
			String subject = cin.nextLine();
			subjectsNames.add(subject);
		}

		ArrayList<Integer> subjectsMarks = new ArrayList<Integer>();
		for (int i = 0; i < subjectCount; i++) {
			System.out.println("Please enter the mark for " + subjectsNames.get(i));
			int mark = cin.nextInt();
			subjectsMarks.add(mark);
		}

		Student student = new Student(studentName, subjectCount, subjectsNames, subjectsMarks);
		student.findAverage();

		System.out.println("your Average is " + student.getAverage());
		student.printYourInformation();
		System.out.println("Good bye "+studentName);
	}
}