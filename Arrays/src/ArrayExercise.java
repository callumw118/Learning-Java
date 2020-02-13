import java.util.Arrays;

// Project was to set up an array which then printed it,
// calculated the average
// and displayed the highest number in the array
public class ArrayExercise {
    int[] numbers = {23, 6, 47, 35, 2, 14};
    int total = 0;
    int average = 0;
    int highestNum = 0;

    public void exercise() {

        printArray();
        printAverage();
        printHighest();
    }

    public void printArray() {
        System.out.print("The numbers in the array = ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public void printAverage() {
        for (int i = 0; i < numbers.length; i++) {
            total = total + numbers[i];
        }
        average = total / numbers.length;
        System.out.print("The average of the array is " + total + " / " + numbers.length + " = " + average);
        System.out.println();
    }

    public void printHighest() {
        Arrays.sort(numbers);
        highestNum = numbers.length - 1;
        System.out.print("The highest number in the array = " + numbers[highestNum]);
    }

}
