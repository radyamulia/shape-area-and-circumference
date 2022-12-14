package src;

// import java.io.FileWriter; // Import FileWriter to write to a file
// import java.io.File; // Import the File class
// import java.io.IOException; // Import the IOException class to handle errors
// import java.io.FileNotFoundException; // import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Tester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String circle = "";
        Double result;
        CircleWithRadius radiusCircle = new CircleWithRadius();
        CircleWithDiameter diameterCircle = new CircleWithDiameter();

        while (true) {
            System.out.print("What do you want to use for the circle (radius/diameter): ");
            try {
                // System.out.print(">>> ");
                circle = input.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid Input");
            }

            if (circle.toLowerCase().equals("radius") || circle.toLowerCase().equals("diameter"))
                break;
            else
                System.out.println("Invalid Input");
        }

        // input.nextLine(); // consume newline
        if (circle.toLowerCase().equals("radius")) {
            result = radiusCircle.circleArea();
            System.out.println("The area of the circle: " + result);
            // history = dateFormatter.format(date) + " >> " + result;
            // fileHandler.createFile(history, "circle-area-history");
        } else {
            System.out.print("Input the diameter of the circle: ");
            result = diameterCircle.circleArea();
            System.out.println("The area of the circle: " + result);
            // history = dateFormatter.format(date) + " >> " + result;
            // fileHandler.createFile(history, "circle-area-history");
        }
        input.close();
    }
}
