package r03ex.ex10;

import java.io.File;
import java.io.FileFilter;

/**
 * Created by WISNIEWSKI.LUKASZ on 2016-05-05.
 */
public class DirectoriesByLambdaDemo {

    public static void main(String[] args) {

        File f = null;
        File[] paths;

        f = new File("c:/");

        paths = f.listFiles(pathname -> {
            return pathname.isDirectory();
        });

        for (File path : paths) {
            System.out.println(path.getName());
        }

    }

}
