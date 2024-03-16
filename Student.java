package studentc;

import java.util.Scanner;

public class Student {
	private String name;
	private int age;
	private String grade;

	public void acceptRecord( ) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter name :  ");
		this.name = sc.nextLine();
		System.out.println(" Enter age :  ");
		this.age = sc.nextInt();
		
		sc.nextLine();
		System.out.println(" Enter grade :  ");
	    this.grade = sc.nextLine();
	}

	public void printRecord() {
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
		System.out.println("Grade: "+this.grade);
	}

	public static void main(String[] args) {
		Student student = new Student();
		student.acceptRecord();
		student.printRecord();
	}

}
