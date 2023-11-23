package main.java.com.example;

import java.io.FileWriter;
import java.io.IOException;

public class IdCardGenerator2 {

    public static void main(String[] args) {
        String filePath = "D:/R&D-Copilot-AI/Project-3/id.html";
        

        try {
            FileWriter fileWriter = new FileWriter(filePath);
            fileWriter.write("<html><meta http-equiv=\"refresh\" content=\"10\"><body><h1>ID Card</h1>");

            fileWriter.write("<div style=\"border: 1px solid grey; height: 400px; width: 350px; margin: 0 auto;\">");
            fileWriter.write("<img src=\"ars.png\" alt=\"ARS Logo\" style=\"height: 50px; width: 300px;\">");
            fileWriter.write("<div style=\"font-family: Tahoma; font-size: 11px;\">131-135, 1st Floor, Nila Technopark</div>");

            fileWriter.write("<div style=\"height: 60px;\"></div>");

            fileWriter.write("<div style=\"background-color: #50C878; height: 30px; width: 350px; font-family: Tahoma; font-size: 20px; color: white; text-align: center; font-weight: bold;\">Dennis</div>");

            fileWriter.write("<div style=\"font-family: Tahoma; font-size: 18px; font-weight: bold;\">Employee Id : xxxxx</div>");

            
     fileWriter.write("<div style=\"height: 50px;\"></div>");
            fileWriter.write("<div style=\"display: flex; justify-content: center;\">");
            fileWriter.write("<img src=\"D:/R&D-Copilot-AI/Project-3/dennis.png\" alt=\"Dennis Image\" style=\"height: 125px; width: 125px;\">");
            fileWriter.write("</div>");

            fileWriter.write("</div>");

            fileWriter.write("</body></html>");

            fileWriter.close();
            System.out.println("HTML file created successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while creating the HTML file.");
            e.printStackTrace();
        }
    }
}
