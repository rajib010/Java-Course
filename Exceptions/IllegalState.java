import java.util.ArrayList;
import java.util.List;

public class IllegalState{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Item1");
        list.add("Item2");

        try {
            // Create an iterator and advance it to the end of the list
            java.util.Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()) {
                iterator.next();
            }
            
            // Try to remove an element without calling next()
            iterator.remove(); // This will throw an IllegalStateException
        } catch (IllegalStateException e) {
            System.out.println("Caught an IllegalStateException: " + e.getMessage());
        }
    }
}


//illegal state exception is thrown when a method is invoked at an inappropriate time.
//calling a method that requires the object to be in a specific state