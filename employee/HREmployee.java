package employee;

import java.util.ArrayList;
import java.util.Date;

public class HREmployee extends Employee {
    ArrayList<String> HRMSPlatforms;

    public HREmployee(String id, String name, Date dateOfJoining, int dailyHours) {
        super(id,name, dateOfJoining, dailyHours);
    }
}
