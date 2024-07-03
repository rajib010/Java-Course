
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//select those who are from jhapa corresponding to the next question
public class SelectingRecords {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("student.txt"))){
           String line;
           line= reader.readLine();
           String[] parts = line.split(", ");
            String address = parts[3];
            if(address.equalsIgnoreCase("Jhaapa")){
                System.out.println("Id: "+parts[0]+", Name: "+parts[1]+", Address: "+parts[2]+", College: "+parts[3]);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
