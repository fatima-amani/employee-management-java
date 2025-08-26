package employee;

import java.util.Date;
import java.util.ArrayList;

public class ManagerEmployee extends Employee {
    private final ArrayList<String> skills;

    public ManagerEmployee(String name, Date dateOfJoining, int dailyHours) {
        super(name, dateOfJoining, dailyHours);
        this.skills = new ArrayList<>();
    }

    public void showDetails() {
        super.showDetails();
        System.out.println("skills: " + skills);
        System.out.println("\n");
    }

    public void addSkill(String skill) {
        this.skills.add(skill);
    }

    public void removeSkill(String skill) {
        this.skills.remove(skill);
    }


    public String getRole() {
        return "Role: Manager";
    }

}
