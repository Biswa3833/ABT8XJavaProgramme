package sept.Task;

public class task4_18092024 {
    public static void main(String[] args) {

        //Q1. Give some another example of Widening with Implicit and Explicit, Narrowing with implicit and explicit.
        // Widening
        int num = 100;
        long l = num;//valid - implicit casting - jvm
        long l1 =(long)num; // valid - explicit casting - jvm
        System.out.println(l1);
        System.out.println(l);

        // Narrowing
        float f = 224.24f;
        // int a = f; // invalid - implicit casting - jvm
        int a1 = (int)f; // invalid - explicit casting - loss of data
        System.out.println(a1);

        // Q2.
        int a = 10;
        System.out.println(--a + a --  + a--);
        System.out.println(a);
        // A --> --a, Exp1 - 9 , a = 9
        // B --> a--,  Exp2 - 9 , a = 8
        // C --> a--, Exp3 - 8, a = 7

        // Q3.
        int a2 = 10;
        System.out.println(  --a2 + a2++ + a2--);
        System.out.println(a2);
        // A --> --a2 , Exp1 - 9, a = 9
        // B --> a2++ , Exp2 - 10, a = 10
        // C -->  a2--, Exp3 - 9 , a = 9

        // Q4.
        int a3  = 10;
        System.out.println(  a3-- + a3 --  + a3 --);
        System.out.println(a3);
        // A --> a3-- , Exp1 - 10, a = 9
        // B --> a3-- , Exp2 - 9, a = 8
        // C --> a3--, Exp3 - 8 , a = 7







    }

}
