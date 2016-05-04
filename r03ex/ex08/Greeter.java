package r03ex.ex08;

/**
 * Created by WISNIEWSKI.LUKASZ on 2016-05-04.
 */
public class Greeter implements Runnable {

    private int n = 0;
    private String target = "";

    public Greeter(int n, String target){
        this.n = n;
        this.target = target;
    }

    public static void main(String[] args) {
        Greeter g1 = new Greeter(10, "John");
        Greeter g2 = new Greeter(10, "Ann");
        g1.run();
        g2.run();
    }


    @Override
    public void run() {
       for(int i = 0; i < n; i++){
           System.out.println("Witaj " + target);
       }
    }
}
