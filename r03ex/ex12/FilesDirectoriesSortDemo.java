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

        //Arrays.sort(tab1, NameComparator);

        Arrays.sort(tab1, (File o1, File o2) -> o2.getName().toUpperCase().compareTo(o1.getName().toUpperCase()));

        for(File file : tab1) {
            System.out.println(file);
        }

    }

    public static Comparator<File> NameComparator = new Comparator<File>() {

        public int compare(File name1, File name2) {

            String fruitName1 = name1.getName().toUpperCase();
            String fruitName2 = name2.getName().toUpperCase();

            //ascending order
            //return fruitName1.compareTo(fruitName2);

            //descending order
            return fruitName2.compareTo(fruitName1);
        }

    };

}
