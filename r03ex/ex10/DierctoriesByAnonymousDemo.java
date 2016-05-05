package r03ex.ex10;

import java.io.File;
import java.io.FileFilter;

/**
 * Created by WISNIEWSKI.LUKASZ on 2016-05-05.
 */
public class DierctoriesByAnonymousDemo {

    public static void main(String[] args) {

        File f = null;
        File[] paths;

        f = new File("c:/");

        paths = f.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isDirectory())
                    return true;
                else
                    return false;
            }
        });

        for(File path : paths) {
            System.out.println(path.getName());
        }
    }

}
