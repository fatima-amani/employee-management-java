package employee;

import java.util.Date;
import java.util.UUID;

public abstract class Employee implements Salary {
    protected String id;
    protected String name;
    protected Date dateOfJoining;
    protected Integer dailyHours;
    protected Float yearsOfExperience;
    protected Float salary;

    public Employee(String name, Date dateOfJoining, int dailyHours) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.dateOfJoining = dateOfJoining;
        this.dailyHours = dailyHours;
        this.salary = 0.0f;
        this.yearsOfExperience = 0.0f;
    }

    public void showDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Date of Joining: " + dateOfJoining);
        System.out.println("Daily Hours: " + dailyHours);
        System.out.println("Years of Experience: " + yearsOfExperience);
        System.out.println("Salary: INR" + salary);
    }

    public void updateExperience(float years) {
        if (years >= 0) {
            this.yearsOfExperience = years;
        }
    }

    @Override
    public Float getSalary() {
        return salary;
    }

    @Override
    public void setSalary(Float newSalary) {
        try {
            if (newSalary > 0) {
                this.salary = newSalary;
            } else {
                throw new IllegalArgumentException("Salary must be greater than 0");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @Override
    public void incrementSalary(Float incrementRate) {
        if (incrementRate > 0) {
            this.salary += (this.salary * incrementRate / 100);
        } else {
            throw new IllegalArgumentException("Increment rate must be greater than 0");
        }
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public Date getDateOfJoining() { return dateOfJoining; }
    public Integer getDailyHours() { return dailyHours; }
    public Float getYearsOfExperience() { return yearsOfExperience; }

    public void setDailyHours(Integer dailyHours) {
        this.dailyHours = dailyHours;
    }

    public void setYearsOfExperience(Float yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}
