import javax.swing.*;
import java.util.Scanner;

public class SwitchStatements {

    public static void main(String[] args) {

        stringCompare();
    }

    public static void console() {

        Scanner user_input = new Scanner(System.in);

        System.out.print("Enter an age: ");
        int age = user_input.nextInt();

        switch (age) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println(age + " is between 0-5");
                break;

            default:
                System.out.println("Age is older than 5");
        }
    }

    public static void popUp() {

        String user_input = JOptionPane.showInputDialog("Enter an age");

        int age = Integer.parseInt(user_input);

        switch (age) {

            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                JOptionPane.showMessageDialog(null, age + " is between 0-5");
                break;

            default:
                JOptionPane.showMessageDialog(null, "Age is older than 5");
        }

    }

    public static void stringCompare() {

        Scanner user_input = new Scanner(System.in);

        System.out.println("Choose a colour: Black, White, Red, Blue");

        String colour = user_input.next();

        switch (colour) {
            case "Black":
                System.out.println("You chose black");

                break;
            case "White":
                System.out.println("You chose white");

                break;
            case "Red":
                System.out.println("You chose red");

                break;
            case "Blue":
                System.out.println("You chose blue");
                break;

            default:
                System.out.println("Incorrect colour");
                stringCompare();

        }
    }

}
