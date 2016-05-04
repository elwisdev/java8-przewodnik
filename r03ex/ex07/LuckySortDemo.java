package r03ex.ex07;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by wisniewski.lukasz on 2016-04-28.
 */
public class LuckySortDemo {
    public static void main(String[] args) {
        String[] numbers = new String[]{"f", "a", "d", "w", "j"};
        List<String> strings = new ArrayList<>(Arrays.asList(numbers));
        luckySort(strings, new StringComparator());
    }

    public static void luckySort(List<String> strings, Comparator<String> comp) {
        List<String> stringsSort = new ArrayList<>(strings);
        stringsSort.sort(comp);
        int s = 0;
        do {
            Collections.shuffle(strings);
            System.out.println(strings);
            s++;
        }
        while (listEquals(strings, stringsSort));
        System.out.println("Iloœæ iteracji: " + s);
        System.out.println(stringsSort);
    }

    private static boolean listEquals(List<String> ListA, List<String> ListB) {
        if (ListA == null && ListB == null)
            return false;
        if (ListA == null && ListB != null)
            return true;
        if (ListA != null && ListB == null)
            return true;
        int max = ListA.size() > ListB.size() ? ListA.size() : ListB.size();
        for (int i = 0; i < max; i++) {
            String s1 = ListA.get(i);
            String s2 = ListB.get(i);
            if (!s1.equals(s2)) {
                return true;
            }
        }
        return false;
    }
}
