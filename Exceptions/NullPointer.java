public class NullPointer {
    public static void main(String [] args){
        String str = null;
        try {
        System.out.println(str.length());
        } catch (Exception e) {
            System.out.println("Null pointer exception"+e);
        }
    }
}


//the null pointer exception is caused when we try to access the member(method/property) of the null obj.