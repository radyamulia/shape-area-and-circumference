package src;

import java.util.*;

import java.text.SimpleDateFormat; // import this class to format date
import java.io.File; // Import this class to read directory
import java.util.function.Consumer;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // main scanner

        // shape object
        Formula formula = new Formula();
        CircleWithRadius radiusCircle = new CircleWithRadius();
        CircleWithDiameter diameterCircle = new CircleWithDiameter();

        // file handling object
        FileHandler fileHandler = new FileHandler();
        File directory = new File("./txt");

        // date format object
        SimpleDateFormat dateFormatter = new SimpleDateFormat("[dd/MM/yyyy   HH:mm:ss]");

        int menuIn = -1;
        double result;
        String history, fileToRead, fileToDelete, circle = "";

        // Array menus to be passed into array
        String[] subMenu = { "1. Rectangle", "2. Square", "3. Triangle", "4. Trapezium", "5. Circle",
                "0. Back to Main Menu" };
        String[] mainMenu = { "1. Count the area of a shape", "2. Count the circumference of a shape",
                "3. Open history", "4. Delete history", "0. Exit program" };

        // Passing mainMenu and subMenu to ArrayList
        ArrayList<String> subMenuList = new ArrayList<String>();
        ArrayList<String> mainMenuList = new ArrayList<String>();

        for (String str : subMenu)
            subMenuList.add(str);
        for (String str : mainMenu)
            mainMenuList.add(str);

        Consumer<String> menuPrinter = (str) -> {
            System.out.println(str);
        };

        // MAIN LOOP (FOR THE WHOLE PROGRAM)
        while (true) {

            Date date = new Date();
            Boolean done = false;
            System.out.println("---- MAIN MENU ----");
            System.out.println("Select the menu you want below");
            mainMenuList.forEach(menuPrinter);

            // INPUT AND CHECKING STATE
            while (true) {
                System.out.print(">>> ");
                try { // Java exceptions to limit the chosen menu and catch error
                    menuIn = input.nextInt();
                    if (menuIn >= 0 && menuIn <= 4)
                        break;
                    else
                        throw new ArithmeticException();
                } catch (InputMismatchException e) {
                    System.out.println("Input based on the existing menu!");
                    input.next();
                } catch (ArithmeticException e) {
                    System.out.println("Input based on the existing menu!");
                }
            }

            System.out.println();

            // SUB-MENU CONDITIONING STATE
            switch (menuIn) {

                // SUB-MENU 1 (COUNT SHAPE AREA)
                case 1:
                    System.out.println("---- Count the Area of a Shape ----");
                    System.out.println("Choose one shape to count the area below");
                    subMenuList.forEach(menuPrinter);

                    // INPUT AND CHECKING STATE
                    while (!done) {
                        System.out.print(">>> ");
                        try { // Java exceptions to limit the chosen menu and catch error
                            menuIn = input.nextInt();
                            if (menuIn >= 0 && menuIn <= 5)
                                break;
                            else
                                throw new ArithmeticException();
                        } catch (InputMismatchException e) {
                            System.out.println("Input based on the existing menu!");
                            input.next();
                        } catch (ArithmeticException e) {
                            System.out.println("Input based on the existing menu!");
                        }
                    }

                    // CONDITIONING STATE (COUNT AREA)
                    switch (menuIn) {
                        case 1:
                            result = formula.rectangleArea();
                            System.out.println("The area of the rectangle: " + result);
                            history = dateFormatter.format(date) + "  >>  " + result;
                            fileHandler.createFile(history, "rectangle-area-history");
                            break;

                        case 2:
                            result = formula.squareArea();
                            System.out.println("The area of the square: " + result);
                            history = dateFormatter.format(date) + "  >>  " + result;
                            fileHandler.createFile(history, "square-area-history");
                            break;

                        case 3:
                            result = formula.triangleArea();
                            System.out.println("The area of the triangle: " + result);
                            history = dateFormatter.format(date) + "  >>  " + result;
                            fileHandler.createFile(history, "triangle-area-history");
                            break;

                        case 4:
                            result = formula.trapeziumArea();
                            System.out.println("The area of the trapezium: " + result);
                            history = dateFormatter.format(date) + "  >>  " + result;
                            fileHandler.createFile(history, "trapezium-area-history");
                            break;

                        case 5:
                            while (true) {
                                input.nextLine(); // consume newline
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
                                history = dateFormatter.format(date) + "  >>  " + result;
                                fileHandler.createFile(history, "circle-area-history");
                            } else {
                                result = diameterCircle.circleArea();
                                System.out.println("The area of the circle: " + result);
                                history = dateFormatter.format(date) + "  >>  " + result;
                                fileHandler.createFile(history, "circle-area-history");
                            }

                            break;

                        case 0:
                            break;
                    }

                    break; // SUB-MENU EXIT STATE

                // SUB-MENU 2 (COUNT SHAPE CIRCUMFERENCE)
                case 2:
                    System.out.println("---- Count the Circumference of a Shape ----");
                    System.out.println("Choose one shape to count the circumference below");
                    subMenuList.forEach(menuPrinter);

                    // INPUT AND CHECKING STATE
                    while (!done) {
                        System.out.print(">>> ");
                        try { // Java exceptions to limit the chosen menu and catch error
                            menuIn = input.nextInt();
                            if (menuIn >= 0 && menuIn <= 5)
                                break;
                            else
                                throw new ArithmeticException();
                        } catch (InputMismatchException e) {
                            System.out.println("Input based on the existing menu!");
                            input.next();
                        } catch (ArithmeticException e) {
                            System.out.println("Input based on the existing menu!");
                        }
                    }

                    // CONDITIONING STATE (COUNT AREA)
                    switch (menuIn) {
                        case 1:
                            result = formula.rectangleCircumference();
                            System.out.println("The circumference of the rectangle: " + result);
                            history = dateFormatter.format(date) + "  >>  " + result;
                            fileHandler.createFile(history, "rectangle-circumference-history");
                            break;

                        case 2:
                            result = formula.squareCircumference();
                            System.out.println("The circumference of the square: " + result);
                            history = dateFormatter.format(date) + "  >>  " + result;
                            fileHandler.createFile(history, "square-circumference-history");
                            break;

                        case 3:
                            result = formula.triangleCircumference();
                            System.out.println("The circumference of the triangle: " + result);
                            history = dateFormatter.format(date) + "  >>  " + result;
                            fileHandler.createFile(history, "triangle-circumference-history");
                            break;

                        case 4:
                            result = formula.trapeziumCircumference();
                            System.out.println("The circumference of the trapezium: " + result);
                            history = dateFormatter.format(date) + "  >>  " + result;
                            fileHandler.createFile(history, "trapezium-circumference-history");
                            break;

                        case 5:
                            while (true) {
                                input.nextLine(); // consume newline
                                System.out.print("What do you want to use for the circle (radius/diameter): ");
                                try {
                                    circle = input.nextLine();
                                } catch (Exception e) {
                                    System.out.println("Invalid Input");
                                }

                                if (circle.toLowerCase().equals("radius") || circle.toLowerCase().equals("diameter"))
                                    break;
                                else
                                    System.out.println("Invalid Input");
                            }

                            if (circle.toLowerCase() == "radius") {
                                result = radiusCircle.circleCircumference();
                                System.out.println("The circumference of the circle: " + result);
                                history = dateFormatter.format(date) + "  >>  " + result;
                                fileHandler.createFile(history, "circle-circumference-history");
                            } else {
                                result = diameterCircle.circleCircumference();
                                System.out.println("The circumference of the circle: " + result);
                                history = dateFormatter.format(date) + "  >>  " + result;
                                fileHandler.createFile(history, "circle-circumference-history");

                            }
                            break;

                        case 0:
                            break;
                    }

                    break; // SUB-MENU EXIT STATE

                // SUB-MENU 3 (READ HISTORY)
                case 3:
                    // prints all the existing history files
                    int counter = 0;
                    System.out.println("-- HISTORY DIRECTORY --");
                    File[] directoryContents = directory.listFiles();
                    for (File object : directoryContents) {
                        System.out.format("%d. %s%n", ++counter, object.getName());
                    }

                    if (counter == 1) {

                        input.nextLine(); // consume the new line so it doesn't affect input below
                        System.out
                                .print("Type the file name to read history or type 99 to go back to MAIN MENU\n>>>  ");
                        fileToRead = input.nextLine();
                        if (fileToRead.equals("99"))
                            break;
                        fileHandler.readFile(fileToRead);
                    } else {
                        System.out.println("History Empty");
                    }

                    break; // SUB-MENU EXIT STATE

                // SUB-MENU 4 (DELETE HISTORY)
                case 4:
                    // prints all the existing history files
                    counter = 0;
                    System.out.println("-- HISTORY DIRECTORY --");
                    File[] directoryContent = directory.listFiles();
                    for (File object : directoryContent) {
                        System.out.format("%d. %s%n", ++counter, object.getName());
                    }

                    if (counter == 1) {
                        input.nextLine(); // consume the new line so it doesn't affect input below
                        System.out.print(
                                "Type the file name to delete history or type 99 to go back to MAIN MENU\n>>>  ");
                        fileToDelete = input.nextLine();
                        if (fileToDelete.equals("99"))
                            break;
                        fileHandler.deleteFile(fileToDelete);
                    } else {
                        System.out.println("History Empty");
                    }

                    break; // SUB-MENU EXIT STATE

                case 0: // SUB-MENU TO EXIT PROGRAM
                    input.close();
                    return;
            }
            System.out.println();
        }
    }
}