import java.util.Arrays;
import java.util.Collections;

public class Array {

    public static void main(String[] args) {

        //Creates an object of the ArrayExercise class
        ArrayExercise project = new ArrayExercise();
        MultiArray multi = new MultiArray();
        ListArray list = new ListArray();

        /*Calls the methods from the different classes
        project.exercise();
        multi.multi();
        list.listMethod();*/
    }

    //Below are basic methods interacting with the array

    public static void arrayLoops() {
        int[] numbers = new int[10];

        //Loops through array incrementing each value of the array by 1
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            System.out.print(numbers[i]);
        }
    }

    public static void sortAscending() {
        int[] numbers = {10, 3, 22, 17};

        //Uses the sort method on the numbers array to sort from low to high
        Arrays.sort(numbers);

        //Loops through array printing each position with the order now changed
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    //Sorts the array in descending order
    public static void sortDescending() {
        int[] numbers = {10, 3, 22, 17};
        Integer[] array = new Integer[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            array[i] = numbers[i];
        }
        Arrays.sort(array, Collections.reverseOrder());

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(array[i]);
        }
    }
}
