import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ImportFromFile implements Importer {

    @Override
    public void importPerson(List<Person> persons){
        try {
            List<String> lines = Files.readAllLines(Paths.get("persoane.txt"));

            for (String line : lines) {
                String[] split = line.split(", ");
                if (split.length == 3) {
                    String firstName = split[0].trim();
                    String lastName = split[1].trim();
                    int age = Integer.parseInt(split[2].trim());
                    persons.add(new Person(firstName, lastName, age));
                }
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }//le ia din fisier
    }

}
