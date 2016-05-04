package r02ex.ex13;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;

/**
 * Created by WISNIEWSKI.LUKASZ on 2016-01-12.
 */
public class ex13 {
    public static void main(String[] args) throws IOException {
        CSVReader reader = new CSVReader(new FileReader("C:\\Projekty\\java8-przewodnik\\r02ex\\ex13\\uk-500.csv"));
        String [] nextLine;
        while ((nextLine = reader.readNext()) != null) {
            // nextLine[] is an array of values from the line
            System.out.println(nextLine[0] + " " + nextLine[1] + " etc...");
        }
        List myEntries = reader.readAll();
        System.out.println(myEntries.get(1));
        System.out.println();
    }
}
