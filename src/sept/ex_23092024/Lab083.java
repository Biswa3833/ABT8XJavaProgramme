package sept.ex_23092024;

public class Lab083 {
    public static void main(String[] args) {
        // // JDK < 13
      int  itemcode = 006;
       switch (itemcode) {
           case 001 , 002, 005:
               System.out.println("all of them are electronic gaget");
               break;
           case 004 , 006 , 007:
               System.out.println("This is mech");
               break;
           default :
               System.out.println("none");
               break;

       }
    }
}

