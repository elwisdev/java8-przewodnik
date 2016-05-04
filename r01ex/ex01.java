package r01ex;

import java.util.Scanner;

/**
 * Created by WISNIEWSKI.LUKASZ on 2016-01-11.
 */
public class ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbê: ");
        int l = in.nextInt();

        System.out.printf("%d\n", l);
        System.out.printf("%x\n", l);
        System.out.printf("%o\n", l);
        System.out.printf("s%\n", l);
        System.out.printf("a%\n", l);
    }
}
