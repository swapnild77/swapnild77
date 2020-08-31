/**
 * 
 */
package com.mindtree.SearchCourse;

import java.util.Scanner;

/**
 * @author M1057685
 * @author Swapnil Dutta
 */
public class SearchCourse {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter no of course");
		int num = in.nextInt();
		if (num <= 0)
			System.out.println("Invalid Range");
		else {
			System.out.println("Enter Course Name");
			String arr[] = new String[num];
			for (int i = 0; i < num; i++) {
				arr[i] = in.next();
			}
			System.out.println("Enter Course to be searched");
			String course = in.next();
			int c = 0;
			for (int i = 0; i < num; i++) {
				if (arr[i].equals(course))
					c++;
			}
			if (c == 0)
				System.out.println("Course not found");
			else
				System.out.println(course + " is available");
		}
	}
}
