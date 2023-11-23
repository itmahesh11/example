package com.example;
import java.io.FileWriter;
import java.io.IOException;

public class Main {


    
    public void test(String args) {
        System.out.println("Hello World!");
    

try {
    FileWriter myWriter = new FileWriter(args);
    myWriter.write("Data to write");
    myWriter.close();
    System.out.println("Successfully wrote to the file.");
} catch (IOException e) {
    System.out.println("An error occurred.");
    e.printStackTrace();
}


    }
}