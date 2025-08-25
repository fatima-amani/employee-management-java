package employee;

import employee.role.DevOpsRole;

import java.util.ArrayList;
import java.util.Date;

public class DevOpsEmployee extends Employee {
    private ArrayList<String> cloudPlatforms;
    private DevOpsRole role;
    private ManagerEmployee manager;

    public DevOpsEmployee(String id, String name, Date dateOfJoining, int dailyHours) {
        super(id, name, dateOfJoining, dailyHours);
        this.cloudPlatforms = new ArrayList<>();
        this.role = DevOpsRole.JUNIOR_DEVOPS_ENGINEER;
    }

    public DevOpsEmployee(String id, String name, Date dateOfJoining, int dailyHours, DevOpsRole role) {
        super(id, name, dateOfJoining, dailyHours);
        this.cloudPlatforms = new ArrayList<>();
        this.role = role;
    }

    @Override
    public String getRole() {
        return "DevOps Engineer - " + role.getRole();
    }

    public void setRole(DevOpsRole role) {
        this.role = role;
    }

    public DevOpsRole getDevOpsRole() {
        return role;
    }

    public void addCloudPlatform(String cloudPlatform) {
        if (cloudPlatform != null && !cloudPlatform.trim().isEmpty()) {
            this.cloudPlatforms.add(cloudPlatform);
        }
    }

    public void removeCloudPlatform(String cloudPlatform) {
        this.cloudPlatforms.remove(cloudPlatform);
    }

    public ArrayList<String> getCloudPlatforms() {
        return new ArrayList<>(cloudPlatforms); // Return a copy for encapsulation
    }

    public void setManager(ManagerEmployee manager) {
        this.manager = manager;
    }

    public ManagerEmployee getManager() {
        return manager;
    }

}
