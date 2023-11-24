package dataBase;

import Classes.Director;
import Classes.Manager;
import Classes.Staff;

public interface dataBaseInterface {
    public void setManager(Manager manager);

    public Manager getManager(String id);

    public void setStaff(Staff staff) ;

    public Staff getStaff(String id);
    public void setDirector(Director director);

    public Director getDirector(String id);
}
