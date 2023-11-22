package com.example;

import java.io.FileWriter;
import java.io.IOException;

// ...
public class AIHtmlTest {


    
    /**
     * The main method is the entry point of the Java program.
     * It is responsible for executing the code within its body.
     *
     * @param args The command-line arguments passed to the program.
     */
    public static void main(String[] args) {

        

        try {
            /**
             * FileWriter is a class used for writing characters to a file.
             * It provides methods for writing data to a file, such as strings, characters, and arrays of characters.
             * The FileWriter class is a subclass of the Writer class and is used to write text to a file.
             */
            FileWriter myWriter = new FileWriter("D:\\R&D-Copilot-AI\\Project-1\\test.html");

            myWriter.write("<html>\n<body>\n<h1>Hi, Mahesh!</h1>\n<label for='name'>Name:</label>\n<input type='text' id='name' name='name'>\n<button type='button' onclick='showSuccess()'>Click Me!</button>\n");

            myWriter.write("<script>\n");
            myWriter.write("function showSuccess() {\n");
            myWriter.write("  var textBox = document.getElementById('showValue');\n");
            myWriter.write("  textBox.value = 'Success';\n");
            myWriter.write("}\n");
            myWriter.write("</script>\n");

            myWriter.write("<label for='showValue'>ShowValue:</label>\n<input type='text' id='showValue' name='showValue'>\n");

            myWriter.write("<div style='text-align: center;'>\n");
            myWriter.write("<img src='D:\\R&D-Copilot-AI\\Project-1\\asimo.jpg' style='height: 399px; width: 300px;'>\n");
            myWriter.write("</div>\n");

            myWriter.write("\n</body>\n</html>");

            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}