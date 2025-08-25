package employee;

import employee.role.DeveloperRole;

import java.util.ArrayList;
import java.util.Date;

public class DeveloperEmployee extends Employee {
    ArrayList<String> technologies;
    DeveloperRole role;
    ManagerEmployee manager;


    public DeveloperEmployee(String id, String name, Date dateOfJoining, int dailyHours){
        super(id, name, dateOfJoining, dailyHours);
        this.technologies = new ArrayList<>();
    }

//    public void setRole(Role role){
//        this.role = Role.role;
//    }

    public void addTechnology(String technology){
        this.technologies.add(technology);
    }

    public void setManager(ManagerEmployee manager){
        this.manager = manager;
    }


}
