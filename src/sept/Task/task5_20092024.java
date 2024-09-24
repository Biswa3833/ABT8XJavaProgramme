package sept.Task;

public class task5_20092024 {
    public static void main(String[] args) {
        //Q1.  Input → int score = 85
// String grade →
//  score >= 90 → A
//  score >= 80 → B
//  score >= 70 → C
        // Ans -1
        // int score = 85;
        // String grade =  (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : "F";
        //  System.out.println(grade);
        //Ans -2
        int score = 85;
        String grade;
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else {
            grade = "F";
        }
        System.out.println("Your grade is: " + grade);



        //Q2. Input int a = 10, int b = 20, int c = 45
        // Max → a,b,c
        // int a = 10;
        //int b = 20;
        //int c = 45;
        //Ans
        // int Max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        //System.out.println(Max);

        //Q3. Write a program that classifies a triangle based on its side lengths.
        //
        //// Given three input values representing the lengths of the sides, determine
        //
        //// if the triangle is equilateral (all sides are equal),
        //
        //// isosceles (exactly two sides are equal), or
        //
        //// scalene (no sides are equal).
        //
        //// Use an if-else statement to classify the triangle.
        //
        //// side1, side2, side3
// Ans
        //   int side1 = 5; // Replace with the lengths of your triangle's sides
        //    int side2 = 4;
        // int side3 = 4;

        // if (side1 == side2 && side2 == side3) {
        //    System.out.println("Equilateral triangle");
        //  } else if (side1 == side2 || side1 == side3 || side2 == side3) {
        //     System.out.println("Isosceles triangle");
        // } else {
        //   System.out.println("Scalene triangle");

        // Q4 . Leap Year 2024
  //Ans
        //int year = 2024; // Replace with the year you want to check
        // boolean isLeapYear = false; //
        //if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
       //     isLeapYear = true;
       // }
       // if (isLeapYear) {
       //     System.out.println(year + " is a leap year.");
      //  } else {
       //     System.out.println(year + " is not a leap year.");
     //   }
    }
}
