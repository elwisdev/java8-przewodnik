package r03ex.ex09;

import r03ex.ex08.Greeter;

/**
 * Created by WISNIEWSKI.LUKASZ on 2016-05-04.
 */
public class RunTogetherInOrderDemo {

    public static void main(String[] args) {
        Greeter g1 = new Greeter(10, "John");
        Greeter g2 = new Greeter(10, "Ann");

        runTogether(g1, g2);

        Greeter g3 = new Greeter(10, "Greg");
        Greeter g4 = new Greeter(10, "Justine");

        runInOrder(g3, g4);

    }

    public static void runTogether(Runnable... tasks) {
        for (Runnable r : tasks)
            new Thread(r).start();
        System.out.println();
    }

    public static void runInOrder(Runnable... tasks) {
        for (Runnable r : tasks)
            r.run();
    }
}
