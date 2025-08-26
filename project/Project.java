package project;

import employee.DevOpsEmployee;
import employee.DeveloperEmployee;
import employee.ManagerEmployee;

import java.util.ArrayList;
import java.util.UUID;

public class Project {
    private final String name;
    private final String projectId;
    private ManagerEmployee manager;
    private final ArrayList<DeveloperEmployee> developers;
    private DevOpsEmployee devOpsEngineer;
    private ProjectStatus status;

    public Project(String name) {
        this.projectId = UUID.randomUUID().toString();
        this.name = name;
        this.manager = null;
        this.developers = new ArrayList<>();
        this.status = null;
    }

    public Project(String name, ManagerEmployee manager, ProjectStatus projectStatus) {
        this.projectId = UUID.randomUUID().toString();
        this.name = name;
        this.manager = manager;
        this.developers = new ArrayList<>();
        this.status = projectStatus;
    }

    public void addDeveloper(DeveloperEmployee developer) {
        if (developer != null && !developers.contains(developer)) {
            this.developers.add(developer);
        }
    }

    public void removeDeveloper(DeveloperEmployee developer) {
        this.developers.remove(developer);
    }

    public void addDevOpsEngineer(DevOpsEmployee devOpsEngineer) {
        this.devOpsEngineer = devOpsEngineer;
    }

    public void updateManager(ManagerEmployee manager) {
        this.manager = manager;
    }

    public void updateStatus(ProjectStatus newStatus) {
        this.status = newStatus;
    }


    public void showProjectDetails() {
        System.out.println("=== Project Details ===");
        System.out.println("Name: " + name);
        System.out.println("ID: " + projectId);
        System.out.println("Status: " + status.getStatus());
        if(manager != null) {
            System.out.println("Manager: " + manager.getName());
        }
        System.out.println("Development Team Size: " + developers.size() + " developers");
        if (devOpsEngineer != null) {
            System.out.println("DevOps Engineer: " + devOpsEngineer.getName());
        }
        System.out.println("\n");
    }


    public String getName() { return name; }
    public String getProjectId() { return projectId; }
    public ManagerEmployee getManager() { return manager; }
    public ArrayList<DeveloperEmployee> getDevelopers() { return new ArrayList<>(developers); }
    public DevOpsEmployee getDevOpsEngineer() { return devOpsEngineer; }
    public String getStatus() { return status.getStatus(); }
}
