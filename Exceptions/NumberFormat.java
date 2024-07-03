public class NumberFormat {
    public static void main(String[] args) {
        String invalidNumber = "123abc"; // This string is not a valid number

        try {
            int num = Integer.parseInt(invalidNumber); // Attempting to convert invalid string to integer
        } catch (NumberFormatException e) {
            System.out.println("Caught a NumberFormatException: " + e.getMessage());
        }

        String validNumber = "123"; // This string is a valid number

        try {
            int num = Integer.parseInt(validNumber); // Converting valid string to integer
            System.out.println("Converted number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Caught a NumberFormatException: " + e.getMessage());
        }
    }
}
