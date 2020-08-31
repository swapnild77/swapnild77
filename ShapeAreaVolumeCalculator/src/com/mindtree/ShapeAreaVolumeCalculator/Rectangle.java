/**
 * 
 */
package com.mindtree.ShapeAreaVolumeCalculator;

/**
 * @author M1057685
 *
 */
public class Rectangle extends Shape {
	private double length;
	private double width;

	/**
	 * @param length
	 * @param width
	 */
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	/**
	 * 
	 */
	public Rectangle() {
	}

	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}

	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double area() {
		return this.getLength() * this.getWidth();
	}

	@Override
	public double volume() {
		return -1;
	}

}
