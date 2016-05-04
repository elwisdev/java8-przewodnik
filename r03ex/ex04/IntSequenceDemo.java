package r03ex.ex04;

import r03ex.IntSequence;
import r03ex.ex05.IntSequenceImple;

/**
 * Created by wisniewski.lukasz on 2016-04-27.
 */
public class IntSequenceDemo {
    public static void main(String[] args) {
        IntSequence z = IntSequenceImpl.of(3, 1, 4, 1, 5, 9);
        z.next();
    }

}
