import javax.swing.*;
import java.util.Scanner;

public class IfStatements {

    public static void main(String[] args) {


    }

    public static void console() {
        Scanner user_input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = user_input.nextByte();

        if (age < 18) {
            System.out.println("You are under 18");
        } else if (age > 18 && age <= 39) {
            System.out.println("You are between 18 - 39");
        } else {
            System.out.println("You are over 39");
        }
    }

    public static void popUp() {

        String user_input = JOptionPane.showInputDialog("Enter your age");

        int age = Integer.parseInt(user_input);

        if (age < 18) {
            JOptionPane.showMessageDialog(null, "You are under 18");
        } else if (age > 18 && age <= 39) {
            JOptionPane.showMessageDialog(null, "You are between 18-39");
        } else {
            JOptionPane.showMessageDialog(null, "You are over 39");
            System.exit(0);
        }
    }

}
