package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class cwh_111_file {
    public static void main(String[] args) {
        // Create a new file
        File myFile = new File("cwh111file.txt");
        try {
            if (myFile.createNewFile()) {]
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("IOException caught: " + e);
        }
        // Write to the file
        try {
            FileWriter fileWriter = new FileWriter("cwh111file.txt");
            fileWriter.write("This is our first file from this Java course\nOkay, now bye");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("IOException caught: " + e);
        }
        // Read the file
        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // Delete the file
        if (myFile.delete()) {
            System.out.println("File deleted: " + myFile.getName());
        } else {
            System.out.println("Some problem occurred while deleting the file");
        }
    }
}
