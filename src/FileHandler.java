package src;

import java.io.FileWriter; // Import FileWriter to write to a file
import java.io.File; // Import the File class
import java.io.IOException; // Import the IOException class to handle errors
import java.io.FileNotFoundException; // import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class FileHandler {
    public void createFile(String arg, String fileName) {
        try {
            String pathName = "./txt/" + fileName;
            File fileObj = new File(pathName);
            if (fileObj.createNewFile()) {
                System.out.println("File created: " + fileObj.getName());
                writeFile(arg, pathName);
                System.out.println("Result added to history -> " + pathName);
            } else {
                writeFile(arg, pathName);
                System.out.println("Result added to history -> " + pathName);
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            // e.printStackTrace();
        }
    }

    public void readFile(String fileName) {
        try {
            String pathName = "./txt/" + fileName;
            File srcFile = new File(pathName);
            Scanner fileScanner = new Scanner(srcFile);

            while (fileScanner.hasNextLine()) {
                String data = fileScanner.nextLine();
                System.out.println(data);
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occured. File not found.");
            // e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("An error occured. Directory empty");
        }
    }

    public void deleteFile(String fileName) {
        File fileObj = new File("./txt/" + fileName);
        if (fileObj.delete()) {
            System.out.println("History deleted: " + fileObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }

    private void writeFile(String arg, String pathName) {
        try {
            FileWriter fileWriter = new FileWriter(pathName, true); // pathName, append
            fileWriter.write(arg + "\n");
            fileWriter.close();
            // System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            // e.printStackTrace();
        }
    }

}
