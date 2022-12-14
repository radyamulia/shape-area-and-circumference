package src;

import java.lang.Math;
import java.util.*;

public class Formula implements FormulaInterface {
    private Scanner input = new Scanner(System.in);

    // returns the area of rectangle
    public double rectangleArea() {
        System.out.print("Input the length of the rectangle: ");
        double length = input.nextDouble();
        System.out.print("Input the width of the rectangle: ");
        double width = input.nextDouble();
        return length * width;
    }

    // returns the cicumference of rectangle
    public double rectangleCircumference() {
        System.out.print("Input the length of the rectangle: ");
        double length = input.nextDouble();
        System.out.print("Input the width of the rectangle: ");
        double width = input.nextDouble();
        return 2 * (length + width);
    }

    // returns the area of trapezium
    public double trapeziumArea() {
        System.out.print("Input the length of the first base: ");
        double base1 = input.nextDouble();
        System.out.print("Input the length of the second base: ");
        double base2 = input.nextDouble();
        System.out.print("Input the height of the trapezium: ");
        double height = input.nextDouble();

        return ((double) (base1 + base2) / 2) * height;
    }

    // returns the circumference of trapezium
    public double trapeziumCircumference() {
        System.out.print("Input the sum of the 2 parallel sides: ");
        double parallelSide = input.nextDouble();
        System.out.print("Input the sum of the 2 non-parallel sides: ");
        double nonParallelSide = input.nextDouble();
        return parallelSide + nonParallelSide;
    }

    // returns the area of triangle
    public double triangleArea() {
        System.out.print("Input the base length of the triangle: ");
        double base = input.nextDouble();
        System.out.print("Input the haight of the triangle: ");
        double height = input.nextDouble();
        return ((double) 1 / 2) * base * height;
    }

    // returns the circumference of triangle
    public double triangleCircumference() {
        System.out.print("Input the first side length of the triangle: ");
        double side1 = input.nextDouble();
        System.out.print("Input the second side length of the triangle: ");
        double side2 = input.nextDouble();
        System.out.print("Input the third side length of the triangle: ");
        double side3 = input.nextDouble();
        return side1 + side2 + side3;
    }

    // returns the area of square
    public double squareArea() {
        System.out.print("Input the length of the square sides: ");
        double side = input.nextDouble();
        return Math.pow(side, 2);
    }

    // returns the circumference of square
    public double squareCircumference() {
        System.out.print("Input the length of the square sides: ");
        double side = input.nextDouble();
        return 4 * side;
    }
}
