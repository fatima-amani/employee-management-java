package employee.role;

public enum DeveloperRole {
    FRONTEND("Frontend Developer"),
    BACKEND("Backend Developer"),
    FULLSTACK("Full Stack Developer");

    private final String role;

    DeveloperRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
