package project;

public enum ProjectStatus {
    PLANNING("Planning"),
    DEV_IN_PROGRESS("Development In Progress"),
    DEV_COMPLETED("Development Completed"),
    QA("Quality Assurance"),
    READY_FOR_PRODUCTION("Ready for Production"),
    IN_PRODUCTION("In Production");

    private final String status;

    ProjectStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
