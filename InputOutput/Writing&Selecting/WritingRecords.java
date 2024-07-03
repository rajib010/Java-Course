//write a program to write the id, name, address and college of 3 students into a file....


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WritingRecords {
    public static void main(String [] args){
        try(PrintWriter writer = new PrintWriter(new FileWriter("students.txt"))){
            writer.println("1, Rajib, Jhapa, DMC");
            writer.println("2, Rupesh, Kirtipur, SMS");
            writer.println("3, Dipesh, Jhapa, Mechi");  
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}



