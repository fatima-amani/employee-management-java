package employee;

import employee.role.DeveloperRole;

import java.util.ArrayList;
import java.util.Date;

public class DeveloperEmployee extends Employee implements Manager{
    private final ArrayList<String> technologies;
    private DeveloperRole role;
    private ManagerEmployee manager;

    public DeveloperEmployee(String name, Date dateOfJoining, int dailyHours, DeveloperRole role) {
        super(name, dateOfJoining, dailyHours);
        this.technologies = new ArrayList<>();
        this.role = role;
    }

    public void showDetails() {
        super.showDetails();
        System.out.println("Technologies: " + technologies);
        System.out.println("Role: " + role);
        System.out.println("Manager: " + manager.getName());
        System.out.println("\n");
    }

    public String getRole() {
        return role.getRole();
    }
    
    public void setRole(DeveloperRole role) {
        this.role = role;
    }

    public void addTechnology(String technology) {
        if (technology != null && !technology.trim().isEmpty()) {
            this.technologies.add(technology);
        }
    }

    public void removeTechnology(String technology) {
        this.technologies.remove(technology);
    }

    public ArrayList<String> getTechnologies() {
        return new ArrayList<>(technologies); // Return a copy for encapsulation
    }

    public void setManager(ManagerEmployee manager) {
        this.manager = manager;
    }

    public ManagerEmployee getManager() {
        return manager;
    }

}
