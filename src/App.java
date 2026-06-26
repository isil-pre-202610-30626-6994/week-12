
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Employee> employees = new ArrayList<>();

        employees.add(new AdministrativeEmployee("A001", "John Doe", 3000, 1000));

        employees.add(new SalesEmployee("S001", "Jane Smith", 2000, 500));

        employees.add(new SupportEmployee("P001", "Bob Johnson", 2500, 10));

        for (Employee employee : employees) {
            employee.showInformation();
        }
    }
}
