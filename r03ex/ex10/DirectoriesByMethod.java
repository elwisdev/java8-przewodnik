package r03ex.ex10;

import java.io.File;
import java.io.FileFilter;

/**
 * Created by WISNIEWSKI.LUKASZ on 2016-05-05.
 */
public class DirectoriesByMethod {

    public static void main(String[] args) {

        File f = null;
        File[] paths;

        f = new File("c:/");

        paths = f.listFiles(filtr());

        for (File path : paths) {
            System.out.println(path.getName());
        }

    }

    public static FileFilter filtr() {
        class Filtr implements FileFilter {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isDirectory())
                    return true;
                else
                    return false;
            }
        }
        return new Filtr();
    }

}



