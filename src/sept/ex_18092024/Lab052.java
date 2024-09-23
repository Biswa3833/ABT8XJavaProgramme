package sept.ex_18092024;

public class Lab052 {
    public static void main(String[] args) {
       // GST = 18.45
        int course = 100;
        float GST = 18.45f;
       //int total_price = course+GST; // Narrowing - invalid - implicit - jvm
        //float total_price = course+GST; // widening - no loss - valid

       int total_price = course+(int)GST; // narrowing - invalid -explicit - loss
        System.out.println(total_price);

    }
}
