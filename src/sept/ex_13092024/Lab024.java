package sept.ex_13092024;

public class Lab024 {
    public static void main(String[] args) {
        //Literals - boolean , Integral , Char
        // Char
        // Single char
        char c1 = 'A';
        char c2 = 'B';
        char c3 = '@';
       // Escape char

        char new_line = '\n'; // to make a new line
        System.out.println("Pramod" + new_line+ "Dutta");
        char tab_line = '\t'; // to make a tab in between the line
        System.out.println("Pramod" + tab_line + "Dutta");
        char back_space = '\b'; // it will use to delete the previous char
        System.out.println("Pramod" + back_space + "Dutta");
        char char_r = '\r'; // it will use to delete the full previous word
        System.out.println("Pramod" + char_r + "Dutta");

        System.out.println("Pramod" + '\n'+ "Dutta");
        System.out.println("Pramod" + '\t' + "Dutta");
        System.out.println("Pramod" + '\b' + "Dutta");
        System.out.println("Pramod" + '\r' + "Dutta");

        //ASCII char value
        char c11 = 'A'; // A = 65

        //Unicode char Value
        char c12 = '\u1F60';
        System.out.println(c12); // ὠ = :)









    }
}
