package employee;

import java.util.Date;

public abstract class Employee {
    String id;
    String name;
    Date dateOfJoining;
    Integer dailyHours;
    Float yearsOfExperience;

    Employee(String id, String name, Date dateOfJoining, int dailyHours) {
        this.id = id;
        this.name = name;
        this.dateOfJoining = dateOfJoining;
        this.dailyHours = dailyHours;
    }
    public void showDetails(String id) {}
    public int updateDailyHours(int newHours) {
        this.dailyHours = newHours;
        return dailyHours;
    }

}
