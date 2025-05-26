import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("nenea", "dumniezo", 22));
        persons.add(new Person("nenea", "dumniezo", 22));

        Exporter exporter;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose export (console/file)");
        String choice = scanner.nextLine().trim().toLowerCase();
        switch (choice) {
            case "console":
                exporter = new ExportToConsole();
                break;
            case "file":
                exporter = new ExportToFile(scanner.nextLine().trim());
                break;
        }
        

    }
}