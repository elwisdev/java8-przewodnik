package r01ex;

import java.util.Scanner;

/**
 * Created by WISNIEWSKI.LUKASZ on 2016-01-11.
 */
public class ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj k�t: ");
        int k = in.nextInt();
        //dodaj warto�� bezwzgl�dn�
        if (k > 359 || k < -359) {
            System.out.println(k % 360);
            System.out.println(Math.floorMod(k, 360));
        } else
            System.out.printf("%d", k);
    }
}
