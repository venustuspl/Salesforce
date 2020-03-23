import java.util.ArrayList;
import java.util.List;

public class Business {

    private String name;

    private List<Employee> Employees = new ArrayList<>();

    public Business(String name, List<Employee> Employees) {
        this.name = name;
        this.Employees = Employees;
    }

    public Business() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return Employees;
    }

    public void setEmployees(List<Employee> Employees) {
        this.Employees = Employees;
    }

    public void addEmployee(Employee employee) {
        this.Employees.add(employee);
    }

    @Override
    public String toString() {
        return "Business{" +
                "name='" + name + '\'' +
                ", Employees=" + Employees +
                '}';
    }
}
