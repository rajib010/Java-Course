public class Demo {

    public static void main(String[] args) {

        // Converting into objects 
        byte a = 1;
        Byte byteObj = a;

        char b = 'g';
        Character charObj = b;

        int c = 100;
        Integer intObj = c;

        float d = 12.2f;
        Float floatObj = d;

        double e = 12.2;
        Double doubleObj = e;

        System.out.println("Values of wrapper class, printing as objects:");
        System.out.println("Byte object: " + byteObj);
        System.out.println("Character object: " + charObj);
        System.out.println("Integer object: " + intObj);
        System.out.println("Float object: " + floatObj);
        System.out.println("Double object: " + doubleObj);

        // Converting into primitive data types 
        byte aa = byteObj;
        char bb = charObj;
        int cc = intObj;
        float dd = floatObj;
        double ee = doubleObj;

        System.out.println("Printing primitive values of each object:");
        System.out.println("byte: " + aa);
        System.out.println("char: " + bb);
        System.out.println("int: " + cc);
        System.out.println("float: " + dd);
        System.out.println("double: " + ee);
    }
}
