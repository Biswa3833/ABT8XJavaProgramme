package sept.ex_23092024;

public class Lab084 {
    public static void main(String[] args) {
        // // JDK < 13
      int  itemcode = 001;
       switch (itemcode) {
           case 001  -> System.out.println("this is a laptop!!"); //multiple statements are not allowed
           case 002  -> System.out.println("This is desktop");
           case 003, 004 -> System.out.println("this is a mobile phone");
           default -> System.out.println("Hello");


       }
    }
}

