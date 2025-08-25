package employee;

import employee.role.DeveloperRole;

import java.util.ArrayList;
import java.util.Date;

public class DeveloperEmployee extends Employee {
    private ArrayList<String> technologies;
    private DeveloperRole role;
    private ManagerEmployee manager;

    public DeveloperEmployee(String id, String name, Date dateOfJoining, int dailyHours) {
        super(id, name, dateOfJoining, dailyHours);
        this.technologies = new ArrayList<>();
    }

    public DeveloperEmployee(String id, String name, Date dateOfJoining, int dailyHours, DeveloperRole role) {
        super(id, name, dateOfJoining, dailyHours);
        this.technologies = new ArrayList<>();
        this.role = role;
    }

    @Override
    public String getRole() {
        return "Developer Role:- " + role.getRole();
    }

    
    public void setRole(DeveloperRole role) {
        this.role = role;
    }

    public DeveloperRole getDeveloperRole() {
        return role;
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
