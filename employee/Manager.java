package employee;

public interface Manager {
    ManagerEmployee manager = null;

    void setManager(ManagerEmployee newManager);
    ManagerEmployee getManager();

}
