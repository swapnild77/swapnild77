/**
 * 
 */
package com.mindtree.ShapeAreaVolumeCalculator;

/**
 * @author M1057685
 *
 */
public class Triangle extends Shape {
	private double base;
	private double height;

	/**
	 * @param base
	 * @param height
	 */
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	/**
	 * 
	 */
	public Triangle() {
	}

	/**
	 * @return the base
	 */
	public double getBase() {
		return base;
	}

	/**
	 * @param base the base to set
	 */
	public void setBase(double base) {
		this.base = base;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double area() {
		double area = 0.5d * this.getBase() * this.getHeight();
		return area;
	}

	@Override
	public double volume() {
		return -1;
	}

}
