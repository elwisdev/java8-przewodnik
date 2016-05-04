package r03ex.ex07;

import java.util.Comparator;

/**
 * Created by wisniewski.lukasz on 2016-04-28.
 */
public class StringComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s1.compareTo(s2);
    }
}
