package r03ex.ex04;

import r03ex.IntSequence;

public class IntSequenceImpl {
    public static IntSequence of(int... args) {
        return new IntSequence() {
            public void next() {
                for (int i : args) {
                    System.out.println(i);
                }
            }
        };
    }
}