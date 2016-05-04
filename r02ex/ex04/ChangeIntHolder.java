package r02ex.ex04;

import jdk.nashorn.internal.runtime.regexp.joni.encoding.IntHolder;

/**
 * Created by WISNIEWSKI.LUKASZ on 2016-01-12.
 */
public class ChangeIntHolder {
    public static void main(String[] args) {

        IntHolder ih1 = new IntHolder();
        IntHolder ih2 = new IntHolder();
        ih1.value = 4;
        ih2.value = 8;

        int i = 4;
        int j = 8;

        changeIH(ih1, ih2);
        System.out.println(ih1.value + " " + ih2.value);

        changeInt(i, j);
        System.out.println(i + " " + j);
    }

    public static void changeIH(IntHolder ih1, IntHolder ih2) {
        ih1.value+=1;
        ih2.value+=1;
    }

    public static void changeInt(int ih1, int ih2) {
        ih1+=1;
        ih2+=1;
    }
}
