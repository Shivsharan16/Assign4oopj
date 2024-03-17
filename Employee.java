package employe;

import java.util.Scanner;

class Employee {
	// field instance variable
	private String name;
	private int empid;
	private float salary;

	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Name: " + this.name);
		int name = sc.nextInt();
		System.out.println("Employee ID: " + this.empid);
		int empid = sc.nextInt();
		System.out.println("Salary: " + this.salary);
		float salary = sc.nextFloat();
	}


	public void printRecord() {
		System.out.println("Name   :"+this.name);
		System.out.println("Employeeid :"+this.empid);
		System.out.println("Salary  :"+this.salary);
}

public class Employee {
	public static void main(String[] args) {
		Employee empolyee = new Employee();

		employee.acceptRecord(); // method call
		employee.printRecord();

	}

}
