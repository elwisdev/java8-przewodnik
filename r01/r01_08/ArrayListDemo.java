package r01.r01_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();
        friends.add("Piotr");
        friends.add("Pawe�");
        friends.remove(1);
        friends.add(0, "Pawe�"); // Dodaje przed elementem 0
        System.out.println("friends=" + friends);
        String first = friends.get(0);
        System.out.println("first=" + first);
        friends.set(1, "Maria");
        for (int i = 0; i < friends.size(); i++) {
            System.out.println(friends.get(i));
        }
        
        ArrayList<String> people = friends;
        people.set(0, "Maria"); // teraz friends.get(0) r�wnie� zwraca "Maria"
        System.out.println("friends=" + friends);
        
        ArrayList<String> copiedFriends = new ArrayList<>(friends);
        copiedFriends.set(0, "Fred"); // doesn't change friends
        System.out.println("copiedFriends=" + copiedFriends);
        System.out.println("friends=" + friends);
        
        friends = new ArrayList<>(Arrays.asList("Piotr", "Pawe�", "Maria"));
        String[] names = friends.toArray(new String[0]);
        System.out.println("names=" + Arrays.toString(names));               
        
        ArrayList<String> moreFriends = new ArrayList<>(Arrays.asList(names));
        System.out.println("moreFriends=" + moreFriends);         
        
        Collections.reverse(friends);
        System.out.println("Po odwr�ceniu, friends=" + friends);
        Collections.shuffle(friends);
        System.out.println("Po wymieszaniu, friends=" + friends);
        Collections.sort(friends);        
        System.out.println("Po sortowaniu, friends=" + friends);
    }
}
