package src;

import java.util.Scanner;

public class CircleWithDiameter extends Circle {
    Scanner input = new Scanner(System.in);
    private final double PI = 3.14159; 

    public double circleArea() {
        System.out.print("Input the diameter of the circle: ");
        double diameter = input.nextDouble();
        double radius = (double) diameter / 2;
        return PI * (Math.pow(radius, 2));
    }

    public double circleCircumference() {
        System.out.print("Input the diameter of the circle: ");
        double diameter = input.nextDouble();
        return PI * diameter;
    }
}
