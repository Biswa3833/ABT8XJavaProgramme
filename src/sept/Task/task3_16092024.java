package sept.Task;

public class task3_16092024 {
    public static void main(String[] args) {
        // Q.1---> Difference between "=" and "=="?
        // Ans -> = is the assignment operator
        // and == is the relational operator
        // Q.2---> byte b = 10; long l = 10l; → How much Byte will be used. ?
        // Ans - In byte b = 10; ---- here byte b has 1 Byte
        //  and in long l = 10l; ----- here long has 8 Byte
        // so total we have = 9 Byte
        //Q.3---> Another byte b = 10; byte c = 10;  What is the answer if the perform b+c, What is the data type it will give in result.
        byte b = 10;
        byte c = 10;
        System.out.println(b+c);// b+c = 20
        // the data type of result(20) is numeric.
        // Q.4--->
         short s = 10;
         char c1 = 'A'; //65
        int ss = s+c1;
        System.out.println(ss); // result = 75




    }

}
