package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator;
        String path = separator +"G:" + separator + "lb1.txt";

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
            System.out.println(row);
        }
        scanner.close();
    }
}
