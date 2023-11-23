import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class IdCardGenerator {
    
    public static void main(String[] args) {
        String filePath = "D:/R&D-Copilot-AI/Project-2/id-card.html";
        String imagePath = "D:/R&D-Copilot-AI/Project-2/nerdy.png";

        try {
            // Write the file
            File file = new File(filePath);
            FileWriter writer = new FileWriter(file);

            writer.write("<html><meta http-equiv=\"refresh\" content=\"10\"><body><h1>Id Card</h1>");

            writer.write("<div style=\"text-align: center;\">");

            writer.write("<div style=\"border: 1px solid blue; display: inline-block; padding: 10px; width:320px\">"); // Add a box around the image with blue color line

            writer.write("<img src=\"D:/R&D-Copilot-AI/Project-2/ars.png\" alt=\"Ars Image\"");
            writer.write("<div/><img src=\"D:/R&D-Copilot-AI/Project-2/nerdy.png\" alt=\"Nerdy Image\" style=\"height: 125px; width: 125px;\">");

            writer.write("<p style=\"text-align: center;\">Name: Wisdom, Age: 27</p>");

            writer.write("</div>");

            writer.write("</div>");

            writer.write("</body></html>");

            writer.close();

            System.out.println("Successful");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
