package Demo;

import java.util.Scanner;

public class StudentAward {

	static String name;
	static int marks;
	static int regNo;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print(" Please Enter the Name : ");
		name = sc.nextLine();
		System.out.print(" Please Enter the Marks : ");
		marks = sc.nextInt();
		System.out.print(" Please Enter the Reg No : ");
		regNo = sc.nextInt();

		int total = 500;

		int Percentage = (marks * 100) / total;

		System.out.println(" Marks Percentage =  " + Percentage);

		if (Percentage >= 90) {
			System.out.println("1st Rank");
		} else if (Percentage >= 80) {
			System.out.println("2nd Rank");
		} else if (Percentage >= 70) {
			System.out.println("3rd Rank");
		} else {
			System.out.println("\n Fail");
		}
	}
}
