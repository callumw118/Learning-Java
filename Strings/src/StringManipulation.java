// This class includes many of the basic String methods

import java.util.Scanner;

public class StringManipulation {

    public static void main(String[] args) {

        formatting();
    }

    // This method introduces the conversion of Strings
    // to upper and lower case
    public static void changeCases() {

        String toChange = "changed to uppercase";
        String toChange2 = "CHANGED TO LOWERCASE";

        System.out.println(toChange.toUpperCase());
        System.out.println(toChange2.toLowerCase());

    }

    // This method introduces how to compare Strings in alphabetical order
    // Prioritises upper case first however compareToIgnoreCase will ignore this
    public static void compareStrings() {
        String firstWord = "Hello";
        String secondWord = "World";

        //compareTo() method returns an int value
        int compare = firstWord.compareTo(secondWord);

        // Checks the value of compare and prints accordingly
        // Returns less than 0 if firstWord comes before
        // Returns more than 0 if firstWord comes after
        if (compare < 0) {
            System.out.println(firstWord + " comes before " + secondWord);
        } else if (compare > 0) {
            System.out.println(firstWord + " comes after " + secondWord);
        } else {
            System.out.println("These words are the same");
        }
    }

    //The indexOf() method locates the position of a character or string within another string
    public static void indexCheck() {
        char at = '@';
        String email = "email@gmail.com";

        // indexOf is looking through the email variable for the at value
        // Will then store its position as the check variable
        // Returns -1 if false and the position if true
        int check = email.indexOf(at);

        if (check == -1) {
            System.out.println("Invalid email address");
        } else {
            System.out.println("Email address is valid");
        }
    }

    // The substring() method allows you to grab one chunk of text from another
    public static void grab() {

        String name = "Bill Gates";
        String letters = "";


        letters = name.substring(2);
        System.out.println(letters);
    }

    // The equals() method checks two strings to see if they are the same
    public static void doesEqual() {

        String one = "Does this match";
        String two = "Does this match";
        Boolean match = false;

        match = one.equals(two);

        if (match == true) {
            System.out.println("The strings match");
        } else {
            System.out.println("The strings do not match");
        }

        // Will only compare objects which is fine for strings. Cannot be used to compare int variables
        // as they are a primitive type. Must be converted to an object

    }

    // The charAt() method returns the character at the specified index in a string.
    public static void characterAt() {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Quit Y/N");

        String choice = userInput.next();

        // Checks position 0 in users input
        char theInput = choice.charAt(0);

        if (theInput == 'Y') {
            System.out.println("System will quit");
        } else {
            System.out.println("System continue");
        }
    }

    // The replace() method in Java is used to replace all occurrence of a character/s in a particular string
    public static void replacement() {

        String message = "Where are you books";

        String corrected = message.replace("you", "your");

        System.out.println(corrected);

    }

    // This method introduces String formatting
    public static void formatting(){

        String exam = "Exam Name";
        String grade = "Exam grade";
        String divider = "--------------------------------";

        String course1 = "Java"; String grade1 = "A";
        String course2 = "HTML & CSS"; String grade2 = "A";

        System.out.printf("%-15s %15s %n", exam, grade);
        System.out.println(divider);

        System.out.printf("%-15s %10s %n", course1, grade1);
        System.out.printf("%-15s %10s %n", course2, grade2);

    }
}


