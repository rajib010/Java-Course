public class IllegalArgument {
    public static void main(String[] args) {
        try {
            setAge(-5); // Attempting to set an invalid age
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an IllegalArgumentException: " + e.getMessage());
        }
    }

    public static void setAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Age must be between 0 and 150. Provided age: " + age);
        }
        System.out.println("Age is set to: " + age);
    }
}


//it indicates an invalid or inappropriate argument passed to a method