//This program introduces using multiple classes and Inheritance

import java.util.Scanner;

public class ExamDetails {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        StudentResults student = new StudentResults();
        Certificates c1 = new Certificates();
        boolean userInputValid = false;
        boolean userInputValid1 = false;

        System.out.print("Enter Student Name: ");
        String name = userInput.next();

        String code = "";
        // as long as code is 0 take user input
        // while( userInputValid == false )
        while(!userInputValid){
            System.out.println("Enter Exam Code: VB, JV or C#");

            code = userInput.next();

            userInputValid = student.validExam(code);
        }
        int score = 0;
        while(!userInputValid1){
            System.out.println("Enter Exam Score: 0-50");

            score = userInput.nextByte();

            userInputValid1 = student.validScore(score);

        }

        //System.out.println("Enter Exam Score: 0-50");
        //int score = userInput.nextByte();

        System.out.println("Student: " + student.fullName(name));
        System.out.println("Exam: " + student.examName(code));
        System.out.println("Score: " + student.examScore(score));
        System.out.println("Grade is " + student.examGrade(score));
        System.out.println(c1.certificateAwarded(score));


    }
}
