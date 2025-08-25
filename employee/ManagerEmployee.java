package employee;

import java.util.Date;
import java.util.ArrayList;

public class ManagerEmployee extends Employee {
    private String department;
    private ArrayList<String> skills;

    public ManagerEmployee(String id, String name, Date dateOfJoining, int dailyHours) {
        super(id, name, dateOfJoining, dailyHours);
        this.skills = new ArrayList<>();
        this.department = "General";
    }

    public ManagerEmployee(String id, String name, Date dateOfJoining, int dailyHours, String department) {
        super(id, name, dateOfJoining, dailyHours);
        this.skills = new ArrayList<>();
        this.department = department;
    }

    @Override
    public String getRole() {
        return "Manager - " + department;
    }  

    public void addSkill(String skill) {
        this.skills.add(skill);
    }

    public void removeSkill(String skill) {
        this.skills.remove(skill);
    }
    
}
