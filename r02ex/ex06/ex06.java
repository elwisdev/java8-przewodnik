package r02ex.ex06;

/**
 * Created by WISNIEWSKI.LUKASZ on 2016-01-12.
 */
public class ex06 {
    public static void main(String[] args) {
        Point p = new Point(3, 4);
                p.translate(1, 3);
                p.scale(0.5);
        System.out.println(p);
    }
}
