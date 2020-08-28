/**
 * 
 */
package com.mindtree.StudentGradeCalculator;

import java.util.Scanner;

/**
 * @author M1057685
 *
 */
public class StudentMain {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		Student student = StudentMain.studentDetails();
		student.calculateAvg();
		student.findGrade();
	}

	public static Student studentDetails() {
		Student student = new Student();
		System.out.println("Enter Student Id");
		int sId = in.nextInt();
		student.setId(sId);
		System.out.println("Enter Student Name");
		String sName = in.next();
		student.setName(sName);
		while (true) {
			System.out.println("Enter the number of subjects");
			int subjects = in.nextInt();
			if (subjects <= 0)
				System.out.println("Invalid number of subjects");
			else {
				int marks[] = new int[subjects];
				for (int i = 0; i < subjects; i++) {
					while (true) {
						System.out.println("Enter the marks of subject " + (i + 1));
						marks[i] = in.nextInt();
						if ((marks[i] >= 0) && (marks[i] <= 100))
							break;
						else {
							System.out.println("Invalid Marks");
							continue;
						}
					}
				}
				student.setMarks(marks);
				break;
			}
		}
		return student;

	}
}
