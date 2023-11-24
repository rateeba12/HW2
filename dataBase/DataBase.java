package dataBase;

import Classes.Director;
import Classes.Employee;
import Classes.Manager;
import Classes.Staff;

import java.util.HashMap;
import java.util.Map;

public class DataBase implements dataBaseInterface{
    Map <String , Manager> Managers = new HashMap<>();
    Map <String , Staff > Staffs = new HashMap<>();
    Map <String , Director > Directors = new HashMap<>();
    public void setManager(Manager manager) {
        Managers.put(manager.getId(),manager);
    }

    public Manager getManager(String id) {
        return Managers.get(id);
    }

    public void setStaff(Staff staff) {
        Staffs.put(staff.getId(),staff);
    }

    public Staff getStaff(String id) {
        return Staffs.get(id);
    }

    public void setDirector(Director director) {
        Directors.put(director.getId(),director);
    }

    public Director getDirector(String id) {
        return Directors.get(id);
    }



}
