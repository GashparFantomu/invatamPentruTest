import java.io.IOException;
import java.util.List;

public interface Exporter {
    void export(List<Person> persons) throws IOException;

}
