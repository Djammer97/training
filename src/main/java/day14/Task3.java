package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people");
        List<Person> peoples = parseFileToObjList(file);
        System.out.println(peoples);
    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> peoples = new ArrayList<>();
        Scanner scanner;

        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не найден");
            return null;
        }

        while (scanner.hasNextLine()) {
            String tempLine = scanner.nextLine();
            String[] people = tempLine.split(" ");
            tempLine = people[0];
            int tempDigit = Integer.parseInt(people[1]);

            if (tempDigit < 0) try {
                throw new DataFormatException();
            } catch (DataFormatException ex) {
                System.out.println("Некорректный входной файл");
                return null;
            }

            peoples.add(new Person(tempLine, tempDigit));
        }
        return peoples;
    }
}