package sept.ex_20092024;

public class Lab075 {
    public static void main(String[] args) {

        //  Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
        //A: 90-100
        // B: 80-89
        // C: 70-79
        // D: 60-69
        //  F: 0-59
        int score = 89; // Replace with your numerical score
        char grade;
        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score <= 90) {
            grade = 'B';
        } else if (score >= 70 && score <= 79) {
            grade = 'C';
        } else if (score >= 60 && score <= 69) {
            grade = 'D';
        } else if (score <= 0 || score > 100) {
            grade = 'O';
            System.out.println("LOL!!, are you god?");
        } else {
            grade = 'F';
        }

        System.out.println("Your grade is: " + grade);
    }
}
