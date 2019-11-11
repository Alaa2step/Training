package jo.secondstep.task1;

import java.util.ArrayList;

public class Student {

	private String name;
	private int subjectNumbers;
	private double average;
	private ArrayList<String> subjectsNames = new ArrayList<String>();
	private ArrayList<Integer> subjectsMarks = new ArrayList<Integer>();

	public Student(String name, int subjectNumbers, ArrayList<String> subjectsNames, ArrayList<Integer> subjectsMarks) {
		this.name = name;
		this.subjectNumbers = subjectNumbers;
		this.subjectsNames = subjectsNames;
		this.subjectsMarks = subjectsMarks;

	}

	public void findAverage() {
		int sum = 0;
		for (int i = 0; i < subjectsMarks.size(); i++) {
			sum += subjectsMarks.get(i);
		}
		average = (double) sum / subjectNumbers;
	}

	public void printYourInformation() {
		System.out.println(name + " has " + subjectNumbers + " subjects");
		for(int i=0;i<subjectNumbers;i++)
		{
			System.out.println(subjectsNames.get(i)+" "+subjectsMarks.get(i));
		}
	}

	
	public String getName() {
		return name;
	}

	public int getSubjectNumbers() {
		return subjectNumbers;
	}

	public double getAverage() {
		return average;
	}

}