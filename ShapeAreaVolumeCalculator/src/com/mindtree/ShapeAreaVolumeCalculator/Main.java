/**
 * 
 */
package com.mindtree.ShapeAreaVolumeCalculator;

import java.util.Scanner;

/**
 * @author M1057685
 *
 */
public class Main {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		Shape shape[] = new Shape[5];
		for (int i = 0; i < 5; i++) {
			if (i == 0) {
				System.out.println("Triangle");
				Triangle triangle = new Triangle();
				double base = in.nextDouble();
				triangle.setBase(base);
				double height = in.nextDouble();
				triangle.setHeight(height);
				shape[i] = triangle;
			}
			if (i == 1) {
				System.out.println("Sphere");
				Sphere sphere = new Sphere();
				double radius = in.nextDouble();
				sphere.setRadius(radius);
				shape[i] = sphere;
			}
			if (i == 2) {
				System.out.println("Rectangle");
				Rectangle rectangle = new Rectangle();
				double length = in.nextDouble();
				rectangle.setLength(length);
				double width = in.nextDouble();
				rectangle.setWidth(width);
				shape[i] = rectangle;
			}
			if (i == 3) {
				System.out.println("Cube");
				Cube cube = new Cube();
				double length = in.nextDouble();
				cube.setLength(length);
				double width = in.nextDouble();
				cube.setWidth(width);
				double height = in.nextDouble();
				cube.setHeight(height);
				shape[i] = cube;
			}
			if (i == 4) {
				System.out.println("Triangle");
				Triangle triangle = new Triangle();
				double base = in.nextDouble();
				triangle.setBase(base);
				double height = in.nextDouble();
				triangle.setHeight(height);
				shape[i] = triangle;
			}
		}
		for (int i = 0; i < 5; i++) {
			if (i == 0)
				System.out.println("Area of Triangle " + shape[i].area());
			if (i == 1) {
				System.out.println("Area of Sphere " + shape[i].area());
				System.out.println("Volume of Sphere " + shape[i].volume());
			}
			if (i == 2) {
				System.out.println("Area of Rectangle " + shape[i].area());
			}
			if (i == 3) {
				System.out.println("Area of Cube " + shape[i].area());
				System.out.println("Volume of Cube " + shape[i].volume());
			}
			if (i == 4)
				System.out.println("Area of Triangle " + shape[i].area());
		}
	}
}
