import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class ReadFromFile implements Importer {

    @Override
    public void importPerson(List<Person> persons) {
        try {
            FileReader fileReader = new FileReader("persoane.txt");
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
