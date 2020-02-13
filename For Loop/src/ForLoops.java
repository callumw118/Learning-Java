import java.util.Scanner;

public class ForLoops {

    public static void main(String[] args) {

    marioPyramid();
    }

    public static void addition() {

        int loopVal;
        int total = 0;

        for (loopVal = 1; loopVal < 101; loopVal++) {

            total = total + loopVal;
        }
        System.out.println("Total = " + total);
    }

    // This method prints out the times table based on user input
    public static void timesTable() {

        Scanner user_input = new Scanner(System.in);

        System.out.print("Which times table do you want: ");

        int times_table = user_input.nextByte();

        for (int i = 1; i <= 10; i++) {
            int total = i * times_table;
            System.out.println(times_table + " times " + i + " = " + total);
        }
    }

    public static void oddNumbers() {

        for (int i = 1; i < 10; i = i + 2) {
            System.out.println(i);

        }
    }

    //Prints a Mario style pyramid
    public static void marioPyramid() {

        Scanner user_input = new Scanner(System.in);

        System.out.print("How high is the pyramid");

        int height = user_input.nextByte();

        for (int i = 0; i < height; i++) {

            int empty_spaces = height - i - 1;

            for (int j = 0; j < height; j++) {
                if (empty_spaces <= j) {
                    System.out.print("#");

                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");

            for (int k = 0; k < (height - empty_spaces); k++) {
                System.out.print("#");
            }
            System.out.print("\n");
        }

    }
}
