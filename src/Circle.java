package src;

import java.util.Scanner;

abstract class Circle {
    Scanner input = new Scanner(System.in);
    private final double PI = 3.14159; 

    // to count the area of the cricle
    abstract double circleArea();
    // to count the circumference of the circle
    double circleCircumference() {                   
        System.out.print("Input the radius of the circle: ");
        double radius = input.nextDouble();
        return 2 * PI * radius;
    }
}
