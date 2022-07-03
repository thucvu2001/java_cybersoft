package cybersoft.java18.javacore;

public class StringDataType {
    public static void main(String[] args) {
        String shortString = "This is a string";
        String anotherString = "This is a string";
        String thirdString = new String("This is a string");

        if (shortString == "This is a string") {
            System.out.println("Bang nhau");
        }
        if (shortString == anotherString) {
            System.out.println("Bang nhau");
        }

        if (shortString == thirdString) {
            System.out.println("Bang nhau");
        }

        if (shortString.equals(thirdString)) {
            System.out.println("Bang nhau");
        }
    }
}
