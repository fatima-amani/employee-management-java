package employee;

import employee.role.DevOpsRole;

import java.util.ArrayList;
import java.util.Date;

public class DevOpsEmployee extends Employee implements Manager{
    private final ArrayList<String> cloudPlatforms;
    private DevOpsRole role;
    private ManagerEmployee manager;

   public DevOpsEmployee(String name, Date dateOfJoining, int dailyHours, DevOpsRole role) {
        super(name, dateOfJoining, dailyHours);
        this.cloudPlatforms = new ArrayList<>();
        this.role = role;
    }

    public void showDetails() {
        super.showDetails();
        System.out.println("Cloud Platforms: " + cloudPlatforms);
        System.out.println("Role: " + role);
        System.out.println("Manager: " + manager.getName());
        System.out.println("\n");
    }

    public String getRole() {
        return this.role.getRole();
    }

    public void setRole(DevOpsRole role) {
        this.role = role;
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
        return new ArrayList<>(cloudPlatforms);
    }

    public void setManager(ManagerEmployee manager) {
        this.manager = manager;
    }

    public ManagerEmployee getManager() {
        return manager;
    }

}
