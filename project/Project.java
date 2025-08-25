package project;

import employee.DevOpsEmployee;
import employee.DeveloperEmployee;
import employee.ManagerEmployee;

import java.util.ArrayList;
import java.util.UUID;

public class Project {
    String name;
    String projectId;
    ManagerEmployee manager;
    ArrayList<DeveloperEmployee> developers;
    DevOpsEmployee devOpsEngineer;

    Project(String name, ManagerEmployee manager) {
        this.projectId = UUID.randomUUID().toString();
        this.name = name;
        this.manager = manager;
        this.developers = new ArrayList<>();
    }

    public void addDeveloper(DeveloperEmployee developer){
        this.developers.add(developer);
    }

    public void removeDeveloper(DeveloperEmployee developer){
        this.developers.remove(developer);
    }

    public void addDevOpsEngineer(DevOpsEmployee devOpsEngineer){
        this.devOpsEngineer = devOpsEngineer;
    }

    public void updateDevOpsEngineer(DevOpsEmployee devOpsEngineer){
        this.devOpsEngineer = devOpsEngineer;
    }

    public void changeManager(ManagerEmployee manager){
        this.manager = manager;
    }
}
