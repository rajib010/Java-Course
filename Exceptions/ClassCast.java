public class ClassCast{
    public static void main(String[] args) {
        Object obj = "This is a string"; // obj is a String

        try {
            int num = (int) obj; // Attempting to cast String to Integer
        } catch (ClassCastException e) {
            System.out.println("Caught a ClassCastException: " + e.getMessage());
        }
    }
}


//class cast exception is thrown when we try to cast an object to an incompatiable type.
//here we are trying to convert string to integer