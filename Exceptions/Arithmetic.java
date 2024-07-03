public class Arithmetic{
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        try {
            int result = numerator / denominator; // This will cause an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        }
    }
}


//arithmetic exception is thrown when an arithmetic expression results in an error,
//like dividing by zero