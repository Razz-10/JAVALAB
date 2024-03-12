package com.mycompany.labwork;
import java.io.*;

public class FileRWriteExample{
    public static void main(String[] args) {
        // Write to a file
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello, this is  written by raaj.");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Read from a file
        try {
            FileReader reader = new FileReader("output.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            System.out.println("Reading from the file:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }
    }
}
