
import java.io.*;

public class CopyDemo {

    public static void main(String[] args) {
        String sourceFile = "Source.txt";
        String destinationFile = "Destination.txt";

        try (FileInputStream fis = new FileInputStream(sourceFile); FileOutputStream fos = new FileOutputStream(destinationFile)) {

            int byteContent;
            // Read and write one byte at a time
            while ((byteContent = fis.read()) != -1) {
                fos.write(byteContent);
            }

            System.out.println("File copied successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred during file copy: " + e.getMessage());
        }
    }
}
