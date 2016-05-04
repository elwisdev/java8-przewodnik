package r02ex.ex05;

/**
 * Created by WISNIEWSKI.LUKASZ on 2016-01-12.
 */
public class ex05 {
    public static void main(String[] args) {

        Point p = new Point(3, 4);
                p.translate(1, 3);
                p.scale(0.5);
        System.out.println(p.getX() + " " + p.getY());

        Point p1 = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.println(p1);
    }
}
