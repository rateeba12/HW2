package Classes;

import java.util.List;

public class Manager {
    Employee employee;
    List<Staff> staffs;
    Manager (String id,String name, int age, float hourlyRate, float totalCompletedHoursForMonth, List<Staff> staffs ){
        this.employee = new Employee(id,name,age,hourlyRate,totalCompletedHoursForMonth);
        this.staffs=staffs;
    }

    public List<Staff> getStaff() {
        return staffs;
    }

    public String getId (){
        return this.employee.getId();
    }
}
