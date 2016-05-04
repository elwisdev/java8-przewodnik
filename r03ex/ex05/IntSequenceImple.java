package r03ex.ex05;

import r03ex.IntSequence;

/**
 * Created by wisniewski.lukasz on 2016-04-27.
 */
public class IntSequenceImple {
    public static IntSequence constant(int i) {
        return () -> {
            do {
                System.out.println(i);
            } while (true);
        };
    }
}
