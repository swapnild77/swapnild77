/**
 * 
 */
package com.mindtree.ShapeAreaVolumeCalculator;

/**
 * @author M1057685
 *
 */
public class Cube extends Shape implements Spatial {
	private double length;
	private double width;
	private double height;

	/**
	 * @param length
	 * @param width
	 * @param height
	 */
	public Cube(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}

	/**
	 * 
	 */
	public Cube() {
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
		double area = 2 * this.getLength() * this.getWidth() + 2 * this.getLength() * this.getHeight()
				+ 2 * this.getWidth() * this.getHeight();
		return area;
	}

	@Override
	public double volume() {
		return this.getLength() * this.getWidth() * this.getHeight();
	}

}
