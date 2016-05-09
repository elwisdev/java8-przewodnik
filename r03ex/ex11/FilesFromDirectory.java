package r03ex.ex11;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;

/**
 * Created by WISNIEWSKI.LUKASZ on 2016-05-05.
 */
public class FilesFromDirectory {

    public static void main(String[] args) {

        File f = null;

        f = new File("c:/");

        String[] tab = f.list((dir, name) -> {
            if ((!dir.isFile() &&
                    name.endsWith(".LOG"))) return true;
            else return false;
        });

        for(String file : tab) {
            System.out.println(file);
        }
    }



}
