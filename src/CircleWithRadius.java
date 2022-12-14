package src;

import java.util.Scanner;

public class CircleWithRadius extends Circle {
    Scanner input = new Scanner(System.in);
    private final double PI = 3.14159; 

    public double circleArea() {
        System.out.print("Input the radius of the circle: ");
        double radius = input.nextDouble();
        return PI * (Math.pow(radius, 2));
    }

    public double circleCircumference() {
        System.out.print("Input the radius of the circle: ");
        double radius = input.nextDouble();
        return 2 * PI * radius;
    }
}
