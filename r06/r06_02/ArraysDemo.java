package r06.r06_02;

public class ArraysDemo {
    public static void main(String[] args) {
        String[] friends = { "Piotr", "Pawe�", "Maria" };
        for(String s : friends) System.out.println(s);

        Arrays.zamiana(friends, 0, 1);
        for(String s : friends) System.out.println(s);
        
        // Usu� komentarz poni�ej aby zobaczy� komunikat o b��dzie
        // Double[] result = Arrays.swap(0, 1, 1.5, 2, 3);
    }
}
