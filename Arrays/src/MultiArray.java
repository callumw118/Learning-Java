
public class MultiArray {

    // This method assigns values to the array
    // starting with the value 10 and incrementing by 1
    public static void multi() {
        int[][] array = new int[4][3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = j + (array[i].length * i) + 10;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}




