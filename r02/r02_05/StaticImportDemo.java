package r02.r02_05;

import static java.lang.Math.*;

public class StaticImportDemo {
    public static void main(String[] args) {
        double x = 3;
        double y = 4;
        double hypothenuse = sqrt(pow(x, 2) + pow(y, 2)); // Math.sqrt, Math.pow
        System.out.println(hypothenuse);        
    }
}
