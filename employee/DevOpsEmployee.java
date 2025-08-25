package employee;

import employee.role.DeveloperRole;

import java.util.ArrayList;
import java.util.Date;

public class DevOpsEmployee extends Employee {
    ArrayList<String> cloudPlatforms;
    DevOpsRole role;
    ManagerEmployee manager;

    public DevOpsEmployee(String id, String name, Date dateOfJoining, int dailyHours){
        super(id, name, dateOfJoining, dailyHours);
        this.cloudPlatforms = new ArrayList<>();
    }

    public void addCloudPlatform(String cloudPlatform){
        this.cloudPlatforms.add(cloudPlatform);
    }

    public void setManager(ManagerEmployee manager){
        this.manager = manager;
    }
}
