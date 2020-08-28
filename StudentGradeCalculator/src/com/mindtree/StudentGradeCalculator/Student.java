/**
 * 
 */
package com.mindtree.StudentGradeCalculator;

/**
 * @author M1057685
 * @author Swapnil Dutta
 */
public class Student {
	private int id;
	private String name;
	private int marks[];
	private float average;
	private char grade;

	/**
	 * @param id
	 * @param name
	 * @param marks
	 * @param average
	 * @param grade
	 */
	public Student(int id, String name, int[] marks, float average, char grade) {
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.average = average;
		this.grade = grade;
	}

	/**
	 * 
	 */
	public Student() {
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the marks
	 */
	public int[] getMarks() {
		return marks;
	}

	/**
	 * @param marks the marks to set
	 */
	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	/**
	 * @return the average
	 */
	public float getAverage() {
		return average;
	}

	/**
	 * @param average the average to set
	 */
	public void setAverage(float average) {
		this.average = average;
	}

	/**
	 * @return the grade
	 */
	public char getGrade() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(char grade) {
		this.grade = grade;
	}

	public void calculateAvg() {
		int sum = 0;
		for (int i = 0; i < this.getMarks().length; i++) {
			sum = sum + marks[i];
		}
		this.setAverage(sum / this.getMarks().length);
		System.out.println("Average is " + this.getAverage());
	}

	public void findGrade() {
		if ((this.getAverage() >= 80) && (this.getAverage() <= 100)) {
			this.setGrade('O');
			System.out.println("The Grade " + this.getGrade());
		}
		if ((this.getAverage() >= 50) && (this.getAverage() < 80)) {
			this.setGrade('O');
			System.out.println("The Grade " + this.getGrade());
		}
		if (this.getAverage() < 50) {
			this.setGrade('F');
			System.out.println("The Grade " + this.getGrade());
		}

	}
}
