package project;

import employee.DevOpsEmployee;
import employee.DeveloperEmployee;
import employee.ManagerEmployee;

import java.util.ArrayList;
import java.util.UUID;

public class Project {
    private String name;
    private String projectId;
    private ManagerEmployee manager;
    private ArrayList<DeveloperEmployee> developers;
    private DevOpsEmployee devOpsEngineer;
    private String status;
    private String description;

    public Project(String name, ManagerEmployee manager) {
        this.projectId = UUID.randomUUID().toString();
        this.name = name;
        this.manager = manager;
        this.developers = new ArrayList<>();
        this.status = "PLANNING";
        this.description = "";
    }

    public Project(String name, ManagerEmployee manager, String description) {
        this.projectId = UUID.randomUUID().toString();
        this.name = name;
        this.manager = manager;
        this.developers = new ArrayList<>();
        this.status = "PLANNING";
        this.description = description;
    }

    public void addDeveloper(DeveloperEmployee developer) {
        if (developer != null && !developers.contains(developer)) {
            this.developers.add(developer);
            System.out.println(developer.getName() + " added to project: " + name);
        }
    }

    public void removeDeveloper(DeveloperEmployee developer) {
        if (this.developers.remove(developer)) {
            System.out.println(developer.getName() + " removed from project: " + name);
        }
    }

    public void addDevOpsEngineer(DevOpsEmployee devOpsEngineer) {
        this.devOpsEngineer = devOpsEngineer;
        System.out.println(devOpsEngineer.getName() + " assigned as DevOps Engineer for project: " + name);
    }

    public void updateDevOpsEngineer(DevOpsEmployee devOpsEngineer) {
        this.devOpsEngineer = devOpsEngineer;
        System.out.println("DevOps Engineer updated for project: " + name);
    }

    public void changeManager(ManagerEmployee manager) {
        this.manager = manager;
        System.out.println("Project manager changed to: " + manager.getName());
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
        System.out.println("Project status updated to: " + newStatus);
    }

    public void startProject() {
        this.status = "IN_PROGRESS";
        System.out.println("Project " + name + " has started!");
    }

    public void completeProject() {
        this.status = "COMPLETED";
        System.out.println("Project " + name + " has been completed!");
    }

    public void showProjectDetails() {
        System.out.println("=== Project Details ===");
        System.out.println("Name: " + name);
        System.out.println("ID: " + projectId);
        System.out.println("Status: " + status);
        System.out.println("Manager: " + manager.getName());
        System.out.println("Description: " + description);
        System.out.println("Team Size: " + developers.size() + " developers");
        if (devOpsEngineer != null) {
            System.out.println("DevOps Engineer: " + devOpsEngineer.getName());
        }
        System.out.println("=====================");
    }

    // Getters and setters
    public String getName() { return name; }
    public String getProjectId() { return projectId; }
    public ManagerEmployee getManager() { return manager; }
    public ArrayList<DeveloperEmployee> getDevelopers() { return new ArrayList<>(developers); }
    public DevOpsEmployee getDevOpsEngineer() { return devOpsEngineer; }
    public String getStatus() { return status; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
