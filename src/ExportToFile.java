import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ExportToFile implements Exporter {
    public final String fileName;
    public ExportToFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void export(List<Person> persons){
        try {
            FileWriter fileWriter = new FileWriter("persoane.txt");
            fileWriter.write(persons.toString() + "\n"); //apeleaza oricum metoda toString(), dar o las aici pentru claritate
            fileWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
