package employee;

import java.util.ArrayList;
import java.util.Date;

public class HREmployee extends Employee {
    private ArrayList<String> hrmsPlatforms;
    private String specialization;

    public HREmployee(String id, String name, Date dateOfJoining, int dailyHours) {
        super(id, name, dateOfJoining, dailyHours);
        this.hrmsPlatforms = new ArrayList<>();
        this.specialization = "General HR";
    }

    public HREmployee(String id, String name, Date dateOfJoining, int dailyHours, String specialization) {
        super(id, name, dateOfJoining, dailyHours);
        this.hrmsPlatforms = new ArrayList<>();
        this.specialization = specialization;
    }

    @Override
    public String getRole() {
        return "HR Specialist - " + specialization;
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
