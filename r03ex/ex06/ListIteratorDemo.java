package r03ex.ex06;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by wisniewski.lukasz on 2016-04-28.
 */
public class ListIteratorDemo {
    public static void main(String[] args) {
        Integer[] numbers = new Integer[]{1, 2, 3, 4, 5};
        ListIterator<Integer> iterator = new ListIterator<>(new ArrayList<>(Arrays.asList(numbers)));
        do {
            System.out.println(iterator.next());
        } while (iterator.hasNext());
    }

}
