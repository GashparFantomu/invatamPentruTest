import java.util.List;

public class ExportToConsole implements Exporter {

    @Override
    public void export(List<Person> persons){
        for(Person person : persons){
            System.out.println(person);
        }
    }
}
