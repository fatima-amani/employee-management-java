import employee.*;
import employee.role.DevOpsRole;
import employee.role.DeveloperRole;
import project.Project;
import project.ProjectStatus;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome to Employee Management!");

        DeveloperEmployee dev1 = new DeveloperEmployee("Fatima", new Date(),8, DeveloperRole.BACKEND);
        DeveloperEmployee dev2 = new DeveloperEmployee("Apeksha", new Date(), 8, DeveloperRole.FRONTEND);

        ManagerEmployee manager1 = new ManagerEmployee("Alaka", new Date(), 5);
        manager1.showDetails();

        dev1.setManager(manager1);
        dev1.addTechnology("Springboot");
        dev1.addTechnology("Express");
        dev1.setYearsOfExperience(2.5f);
        dev1.showDetails();

        dev2.addTechnology("React");
        dev2.setManager(manager1);
        dev2.showDetails();

        DevOpsEmployee devops1 = new DevOpsEmployee("Darshana",new Date(), 10, DevOpsRole.SENIOR_DEVOPS_ENGINEER);

        devops1.setManager(manager1);
        devops1.addCloudPlatform("AWS");
        devops1.addCloudPlatform("GCP");
        devops1.addCloudPlatform("Azure");
        devops1.addCloudPlatform("Linode");
        devops1.showDetails();

        HREmployee hr = new HREmployee("Aamna", new Date(), 14, "Talent Aquisition");
        hr.addHRMSPlatform("Sum HR");
        hr.showDetails();

        Project project = new Project("JobScraper",manager1, ProjectStatus.PLANNING);
        project.addDevOpsEngineer(devops1);
        project.addDeveloper(dev1);
        project.addDeveloper(dev2);
        project.updateStatus(ProjectStatus.DEV_IN_PROGRESS);
        project.showProjectDetails();
    }
}