package com.example;

import org.junit.Test;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testWriteToFile() {
        Main main = new Main();
        String filePath = "test.txt";
        String expectedData = "Data to write";

        main.test(filePath);

        assertTrue("File should exist", Files.exists(Paths.get(filePath)));

        try {
            String actualData = new String(Files.readAllBytes(Paths.get(filePath)));
            assertEquals("File content should match", expectedData, actualData);
        } catch (IOException e) {
            fail("An error occurred while reading the file");
        }

        // Clean up the file after the test
        File file = new File(filePath);
        file.delete();
    }
}