package sept.ex_18092024;

public class Lab050 {
    public static void main(String[] args) {
        // Type Casting
        // Widening - implicit explicit - lossless
        // Narrowing - implicit explicit(with data type) - loss

        // Widening
        byte b = 10;
        int a = b; // valid - implicit casting -jvm
        int a1 = (int)b; // valid - explicit  casting - jvm

        // Narrowing

        int val = 300;
        //byte b1 = val; // invalid - implicit casting
        byte b2 = (byte)val; // invalid - explicit casting - loss of data - jvm
        System.out.println(b2);



    }
}
