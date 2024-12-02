package jdbc22;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        // Create objects
        Undergrad undergrad = new Undergrad("Alice", "U123", 55.0, 20, "123 Elm St");
        Grad grad = new Grad("Bob", "G456", 58.0, 25, "456 Oak St");

        // Test isPassed method
        System.out.println("Undergrad passed: " + undergrad.isPassed(undergrad.grade));
        System.out.println("Grad passed: " + grad.isPassed(grad.grade));

        // Save details to file
        copyToFile(undergrad, grad);
    }

    public static void copyToFile(Superclass undergrad, Superclass grad) {
        try {
            // Load properties file
            Properties props = new Properties();
            props.load(Main.class.getResourceAsStream("/config.properties"));

            // Get file path
            String filePath = props.getProperty("filePath");

            // Write to file
            FileWriter writer = new FileWriter(filePath);
            writer.write("Undergrad Details:\n" + undergrad.toString() + "\n\n");
            writer.write("Grad Details:\n" + grad.toString() + "\n");
            writer.close();

            System.out.println("Details saved to file: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
