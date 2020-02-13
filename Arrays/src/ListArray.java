import java.util.ArrayList;
// The Iterator class is needed to go look through the array
import java.util.Iterator;

// Array lists are used if you are unsure how big the array will be
public class ListArray {

    public static void listMethod() {

        ArrayList list = new ArrayList();

        // add() method will add to the array
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add(4);

        // This line attaches the list array to the iterator
        Iterator array = list.iterator();

        // The while loop will continue to loop until there are no longer any values in the array
        while (array.hasNext()) {
            System.out.println(array.next());
        }

        // remove() method will remove an item from the array, in this case position 2
        list.remove(2);
        System.out.println(list);

        // get() method will retrieve what ever is in the index position, in this case position 1
        System.out.println(list.get(1));
    }


}
