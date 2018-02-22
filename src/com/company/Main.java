package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.function.Consumer;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = separator + '.' + separator + "lb1.txt";

        File file = new File(path);
        //File file = new File("G:\\lb1.txt");

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            String row = scanner.nextLine();
            //split или побуквенная проверка на разделитель. Вход row="int x,y"
            //int
            //x
            //,
            //y
            //System.out.println(row);
            Pattern pattern = Pattern.compile(" |;|,");
            // спитати , чи є кращі параметри для розділення Pattern pattern = Pattern.compile(" ??? ");
            String[] lexems;
            lexems = pattern.split(row);
            Arrays.asList(lexems).forEach(lexem -> System.out.println(lexem) );
        }
        scanner.close();
    }
}
