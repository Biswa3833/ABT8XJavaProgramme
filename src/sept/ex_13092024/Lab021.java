package sept.ex_13092024;

public class Lab021 {
    public static void main(String[] args) {

        //Problem Statement - print the table of 2
       // print the table of 2 with use the concept of Formating

        //if you have integer the we can use %d
        // %d - any integer, byte, short , long,
        //%s - String class
        //%c - char
        // %f - float , double

        //System.out.println("2*1 = 2");
        //System.out.println("2*2 = 4");
        //System.out.println("2*10 = 20");
        int num = 10;
        System.out.printf("Value of %d" , num);
        //here the %d is correspondence to value
        //System.out.println("2*1=2");
        System.out.printf("%d * %d = %d" , num,1,num*1);
        System.out.println();
        System.out.printf("%d * %d = %d" , num,2,num*2);




    }
}
