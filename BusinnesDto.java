import java.util.ArrayList;
import java.util.List;

public class BusinnesDto {
    private List<Business> businessList = new ArrayList<>();

    public BusinnesDto() {
    }

    public List<Business> getBusinessList() {
        return businessList;
    }

    public void setBusinessList(List<Business> businessList) {
        this.businessList = businessList;
    }

    public void addToBusinessList(Business business) {
        this.businessList.add(business);
    }

    @Override
    public String toString() {
        String result = "";
        for (Business business : businessList) {
            result += business.getName() + "\n";
            for (Employee employee : business.getEmployees()) {
                result += "Name: " + employee.getName() + "Phone: " + employee.getPhone() + "Email: " + employee.getEmail() + "\n";
            }

        }
        return result;
    }
}
