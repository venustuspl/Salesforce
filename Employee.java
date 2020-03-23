public class Employee {
    private String Name;
    private String Phone;
    private String Email;

    public Employee(String name, String phone, String email) {
        Name = name;
        Phone = phone;
        Email = email;
    }

    public Employee() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + Name + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}
