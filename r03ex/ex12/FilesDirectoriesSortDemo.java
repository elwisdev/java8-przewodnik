package r03ex.ex12;

import java.io.File;
//import java.util.Collections;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by wisniewski.lukasz on 2016-05-09.
 */
public class FilesDirectoriesSortDemo {

    public static void main(String[] args) {

        File f = null;

        f = new File("c:/");

        File[] tab = f.listFiles((dir, name) -> {
             return true;
        });

        for(File file : tab) {
            System.out.println(file);
        }

        System.out.println("_____________");

        File[] tab1 = f.listFiles();

        Arrays.sort(tab1, FruitNameComparator);

        for(File file : tab1) {
            System.out.println(file);
        }

    }

    public static Comparator<File> FruitNameComparator = new Comparator<File>() {

        public int compare(File fruit1, File fruit2) {

            String fruitName1 = fruit1.getName().toUpperCase();
            String fruitName2 = fruit2.getName().toUpperCase();

            //ascending order
            //return fruitName1.compareTo(fruitName2);

            //descending order
            return fruitName2.compareTo(fruitName1);
        }

    };

}
