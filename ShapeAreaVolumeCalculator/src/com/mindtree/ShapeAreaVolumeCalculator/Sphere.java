/**
 * 
 */
package com.mindtree.ShapeAreaVolumeCalculator;

/**
 * @author M1057685
 *
 */
public class Sphere extends Shape implements Spatial{
	private double radius;

	/**
	 * @param radius
	 */
	public Sphere(double radius) {
		this.radius = radius;
	}

	/**
	 * 
	 */
	public Sphere() {
	}

	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		double area = 4 * Math.PI * this.getRadius() * this.getRadius();
		return area;
	}

	@Override
	public double volume() {
		double vol = 4 * Math.PI * this.getRadius() * this.getRadius() * this.getRadius()/3;
		return vol;
	}

}
