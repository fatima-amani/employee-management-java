package employee.role;

public enum DevOpsRole {
    SENIOR_DEVOPS_ENGINEER("Senior DevOps Engineer"),
    JUNIOR_DEVOPS_ENGINEER("Junior DevOps Engineer");

    private final String role;

    DevOpsRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
