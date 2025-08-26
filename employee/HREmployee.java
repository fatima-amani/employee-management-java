package employee;

import java.util.ArrayList;
import java.util.Date;

public class HREmployee extends Employee {
    private final ArrayList<String> hrmsPlatforms;
    private String specialization;

    public HREmployee(String name, Date dateOfJoining, int dailyHours, String specialization) {
        super(name, dateOfJoining, dailyHours);
        this.hrmsPlatforms = new ArrayList<>();
        this.specialization = specialization;
    }
    public void showDetails() {
        super.showDetails();
        System.out.println("hrms Platforms: " + hrmsPlatforms);
        System.out.println("Specialization: " + specialization);
        System.out.println("\n");
    }

    public String getRole() {
        return "Role: " + specialization;
    }


    public void addHRMSPlatform(String platform) {
        if (platform != null && !platform.trim().isEmpty()) {
            this.hrmsPlatforms.add(platform);
        }
    }

    public void removeHRMSPlatform(String platform) {
        this.hrmsPlatforms.remove(platform);
    }

    public ArrayList<String> getHRMSPlatforms() {
        return new ArrayList<>(hrmsPlatforms);
    }


    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
