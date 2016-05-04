package r06.r06_02;

public class ArraysDemo {
    public static void main(String[] args) {
        String[] friends = { "Piotr", "Pawe³", "Maria" };
        for(String s : friends) System.out.println(s);

        Arrays.zamiana(friends, 0, 1);
        for(String s : friends) System.out.println(s);
        
        // Usuñ komentarz poni¿ej aby zobaczyæ komunikat o b³êdzie
        // Double[] result = Arrays.swap(0, 1, 1.5, 2, 3);
    }
}
